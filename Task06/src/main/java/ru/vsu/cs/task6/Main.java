package ru.vsu.cs.task6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);
        System.out.print("Input x (-1 < x < 1): ");
        double x = scanner.nextDouble();
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        System.out.print("Input e: ");
        double e = scanner.nextDouble();
        if (x <= -1 || x >= 1) {
            System.out.println("x must be in (-1, 1)");
            return;
        }
        double[] sums = calcSums(x, n, e);
        System.out.printf(Locale.ROOT, "1) Sum of %d terms: %.10f%n", n, sums[0]);
        System.out.printf(Locale.ROOT, "2) Sum of terms with |a| > e: %.10f%n", sums[1]);
        System.out.printf(Locale.ROOT, "3) Sum of terms with |a| > e/10: %.10f%n", sums[2]);
        System.out.printf(Locale.ROOT, "4) Math value ln(1 + x^3): %.10f%n", calcByMath(x));
    }

    public static double nextTerm(int n, double prevTerm, double x) {
        return prevTerm * (-x * x * x) * (n - 1) / n;
    }

    public static double[] calcSums(double x, int n, double e) {
        double sumN = 0;
        double sumE = 0;
        double sumE10 = 0;
        double term = x * x * x;
        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                term = nextTerm(i, term, x);
            }
            sumN += term;
            if (Math.abs(term) > e) {
                sumE += term;
            }
            if (Math.abs(term) > e / 10) {
                sumE10 += term;
            }
        }
        return new double[]{sumN, sumE, sumE10};
    }

    public static double calcByMath(double x) {
        return Math.log(1 + x * x * x);
    }
}
