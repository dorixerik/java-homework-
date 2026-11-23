package ru.vsu.cs.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        System.out.println("Palindrome number " + n + ": " + findNthPalindrome(n));
    }

    public static long reverse(long number) {
        long result = 0;
        while (number > 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }

    public static boolean isPalindrome(long number) {
        return number == reverse(number);
    }

    public static long findNthPalindrome(int n) {
        int count = -1;
        long number = -1;
        while (count < n) {
            number++;
            if (isPalindrome(number)) {
                count++;
            }
        }
        return number;
    }
}
