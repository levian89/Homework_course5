package org.fasttrackit.course5.homework;

import java.util.Scanner;

public class HackerrankExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfTwoNumbers = getSumOfTwoNumbers(scanner);
        System.out.println("Sum of the two numbers is: " + sumOfTwoNumbers);
        System.out.println("*********");

        int[] userArray = getIntegerArrayFromUserInput(scanner);
        int sumOfArrayElements = returnArraySum(userArray);
        System.out.println("Sum of elements of the array: " + sumOfArrayElements);
        System.out.println("*********");

        int firstRatingOfAlice = getRatingOfAlice(scanner);
        int secondRatingOfAlice = getRatingOfAlice(scanner);
        int thirdRatingOfAlice = getRatingOfAlice(scanner);
        int firstRatingOfBob = getRatingOfBob(scanner);
        int secondRatingOfBob = getRatingOfBob(scanner);
        int thirdRatingOfBob = getRatingOfBob(scanner);
        compareTheTriplets(firstRatingOfAlice, secondRatingOfAlice, thirdRatingOfAlice,
                firstRatingOfBob, secondRatingOfBob, thirdRatingOfBob);
        System.out.println("*********");

        int[] userArray1 = getIntegerArrayFromUserInput(scanner);
        long sumOfArrayElements1 = returnArrayLongSum(userArray1);
        System.out.println("Sum of elements of the array: " + sumOfArrayElements1);
        System.out.println("*********");

        int[][] table = getMatrixValuesFromUserInput(scanner);
        displayTheMatrixValues(table);
        int principalDiagonalSum = getPrincipalDiagonalSum(table);
        int secondaryDiagonalSum = getSecondaryDiagonalSum(table);
        int absoluteDifference = Math.abs(principalDiagonalSum - secondaryDiagonalSum);
        System.out.println("Absolute diagonal difference is: " + absoluteDifference);
        System.out.println("*********");

        int[] userArray2 = getIntegerArrayFromUserInput(scanner);
        printRatiosFromAnIntegerArray(userArray2);
    }

    public static int getSumOfTwoNumbers(Scanner scanner) {
        System.out.println("Enter the first value: ");
        int firstValue = scanner.nextInt();
        System.out.println("Enter the second value: ");
        int secondValue = scanner.nextInt();
        return firstValue + secondValue;
    }

    public static int[] getIntegerArrayFromUserInput(Scanner scanner) {
        System.out.println("Enter the length of the integer array: ");
        int lengthOfArray = scanner.nextInt();
        int[] userArray = new int[lengthOfArray];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < lengthOfArray; i++) {
            userArray[i] = scanner.nextInt();
        }
        return userArray;
    }

    public static int returnArraySum(int[] integers) {
        int sum = 0;
        for (int integer : integers) {
            sum += integer;
        }
        return sum;
    }

    private static int getRatingOfAlice(Scanner scanner) {
        System.out.println("Enter Alice's rating: ");
        return scanner.nextInt();
    }

    private static int getRatingOfBob(Scanner scanner) {
        System.out.println("Enter Bob's rating: ");
        return scanner.nextInt();
    }

    public static void compareTheTriplets(int firstRatingOfAlice, int secondRatingOfAlice, int thirdRatingOfAlice,
                                          int firstRatingOfBob, int secondRatingOfBob, int thirdRatingOfBob) {
        int pointsOfAlice = 0;
        int pointsOfBob = 0;
        if (firstRatingOfAlice > firstRatingOfBob) {
            pointsOfAlice++;
        } else if (firstRatingOfAlice < firstRatingOfBob) {
            pointsOfBob++;
        }

        if (secondRatingOfAlice > secondRatingOfBob) {
            pointsOfAlice++;
        } else if (secondRatingOfAlice < secondRatingOfBob) {
            pointsOfBob++;
        }

        if (thirdRatingOfAlice > thirdRatingOfBob) {
            pointsOfAlice++;
        } else if (thirdRatingOfAlice < thirdRatingOfBob) {
            pointsOfBob++;
        }
        System.out.println("Total points of Alice: " + pointsOfAlice + "; total points of Bob: " + pointsOfBob);
    }

    public static long returnArrayLongSum(int[] integers) {
        long sum = 0;
        for (int integer : integers) {
            sum += integer;
        }
        return sum;
    }

    public static int[][] getMatrixValuesFromUserInput(Scanner scanner) {
        System.out.println("Enter the length of the matrix: ");
        int lengthOfTheMatrix = scanner.nextInt();
        int[][] table = new int[lengthOfTheMatrix][lengthOfTheMatrix];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = scanner.nextInt();
            }
        }
        return table;
    }

    public static void displayTheMatrixValues(int[][] table) {
        System.out.println("Elements of the matrix are: ");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int getPrincipalDiagonalSum(int[][] table) {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j) {
                    sum += table[i][j];
                }
            }
        }
        return sum;
    }

    public static int getSecondaryDiagonalSum(int[][] table) {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i + j == table.length - 1) {
                    sum += table[i][j];
                }
            }
        }
        return sum;
    }

    public static void printRatiosFromAnIntegerArray(int[] integers) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int integer : integers) {
            if (integer > 0) {
                positiveCount++;
            } else if (integer < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.print("Ratios of positive values: " + String.format("%.6f", (double) positiveCount / integers.length)
                + "\n" + "Ratios of negative values: " + String.format("%.6f", (double) negativeCount / integers.length)
                + "\n" + "Ratios of zero values: " + String.format("%.6f", (double) zeroCount / integers.length));
    }
}
