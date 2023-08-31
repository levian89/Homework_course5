package org.fasttrackit.course5.homework;

import java.util.ArrayList;
import java.util.Random;

public class Exercises {
    public static void main(String[] args) {
        int[] integers = {1, 2, 4, 6, 7, 8, 10, 14};
        String phrase = "Hey, there. What is going on. Are you ok.";
        System.out.println("Sum of the elements from the array is: " + returnIntegersSum(integers));
        System.out.println("************");
        System.out.println("Number of the odd elements from the array is: " + returnNumberOfOddElements(integers));
        System.out.println("************");
        System.out.println("Numbers greater than the given number are: "
                + returnElementsGreaterThanTheNumber(integers, 3));
        System.out.println("************");
        collectDonations(10000);
        System.out.println("************");
        collectDonations(10000, 5);
        System.out.println("************");
        printOneSentencePerLine(phrase);
    }

    public static int returnIntegersSum(int[] integers) {
        int sum = 0;
        for (int integer : integers) {
            sum += integer;
        }
        return sum;
    }

    public static int returnNumberOfOddElements(int[] integers) {
        int countOfOddNumbers = 0;
        for (int integer : integers) {
            if (integer % 2 != 0) {
                countOfOddNumbers++;
            }
        }
        return countOfOddNumbers;
    }

    //Exercise 3
    public static ArrayList<Integer> returnElementsGreaterThanTheNumber(int[] integers, int number) {
        ArrayList<Integer> returnedIntegers = new ArrayList<>();
        for (int integer : integers) {
            if (integer > number) {
                returnedIntegers.add(integer);
            }
        }
        return returnedIntegers;
    }

    public static void collectDonations(int targetOfDonations) {
        int sumOfDonations = 0;
        Random random = new Random();
        int randomDonation;

        while (sumOfDonations < targetOfDonations) {
            randomDonation = random.nextInt(targetOfDonations);
            System.out.println("Donation: " + randomDonation);
            sumOfDonations += randomDonation;
            System.out.println("Sum of donations: " + sumOfDonations);
        }

        if (sumOfDonations == targetOfDonations) {
            System.out.println("Success! Target: " + targetOfDonations + " of donations reached!");
        } else {
            System.out.println("Target of donations surpassed!");
            int difference = sumOfDonations - targetOfDonations;
            sumOfDonations = sumOfDonations - difference;
            System.out.println("Sum of donations after the target is " +
                    "surpassed and the difference is applied: " + sumOfDonations);
        }
    }

// nu stiu exact cum sa pun conditia ca sumOfDonations sa nu depaseasca targetOfDonations
// (ca sumOfDonations sa se opreasca exact cand e egal cu targetOfDonations)
// (ore intregi m-am chinuit sa incerc sa rezolv asta :(, si probabil ii destul de simplu :)  )
// stiu ca nu e exact solutia la cerinta problemei, dar chiar nu stiu cum as putea sa rezolv altfel

    public static void collectDonations(int targetOfDonations, int maximumNumberOfDonation) {
        int sumOfDonations = 0;
        int countOfDonations = 0;
        Random random = new Random();
        int randomDonation;

        while (countOfDonations < maximumNumberOfDonation) {
            randomDonation = random.nextInt(targetOfDonations);
            System.out.println("Donation: " + randomDonation);
            countOfDonations++;
            System.out.println("Number of donations: " + countOfDonations);
            sumOfDonations += randomDonation;
            System.out.println("Sum of donations: " + sumOfDonations);
        }

        if (sumOfDonations == targetOfDonations && countOfDonations == maximumNumberOfDonation) {
            System.out.println("Success! Target of donations and maximum number of donations reached!");
        } else if (sumOfDonations == targetOfDonations || countOfDonations == maximumNumberOfDonation) {
            System.out.println("Either target or maximum number of donations reached!");
        }
    }

    public static void printOneSentencePerLine(String phrase) {
        String[] arrayOfSentences = phrase.split("\\.");
        String[] arrayOfSentences1 = phrase.split("[.]");
        for (String sentence : arrayOfSentences1) {
            System.out.println(sentence.trim());
        }
    }
}
