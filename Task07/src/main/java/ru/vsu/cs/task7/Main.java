package ru.vsu.cs.task7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[][] tests = {
                {1, 2, 3, 1, 2, 3, 4, 1},
                {},
                {5},
                {7, 7, 7, 7},
                {1, 2, 3, 4, 5},
                {1, 2, 1, 2, 1, 2},
                {1, 2, 3, 1, 4, 5, 6},
                {-1, -2, -3, -1, -2, -3},
                {1, 2, 3, 3, 4, 5},
                {4, 5, 4, 6, 7, 8, 4, 9},
                {0, 0, 1, 0, 1, 2},
                {10, -10, 10, -10, 20}
        };
        for (int[] test : tests) {
            runTest(test);
        }
        Scanner scanner = new Scanner(System.in);
        int[] userArray = readArray(scanner);
        runTest(userArray);
    }

    public static boolean isUnique(int[] array, int start, int end, int value) {
        for (int i = start; i < end; i++) {
            if (array[i] == value) {
                return false;
            }
        }
        return true;
    }

    public static int[] solution(int[] array) {
        int bestStart = 0;
        int bestLength = 0;
        int start = 0;
        for (int end = 0; end < array.length; end++) {
            while (!isUnique(array, start, end, array[end])) {
                start++;
            }
            int length = end - start + 1;
            if (length >= bestLength) {
                bestLength = length;
                bestStart = start;
            }
        }
        return new int[]{bestStart, bestLength};
    }

    public static int[] readArray(Scanner scanner) {
        System.out.print("Input array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Input elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print(Arrays.toString(array));
    }

    public static void runTest(int[] array) {
        int[] result = solution(array);
        printArray(array);
        System.out.print(" -> position: " + result[0] + ", length: " + result[1] + ", subsequence: ");
        printArray(Arrays.copyOfRange(array, result[0], result[0] + result[1]));
        System.out.println();
    }
}
