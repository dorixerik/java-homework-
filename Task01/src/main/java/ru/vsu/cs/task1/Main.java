package ru.vsu.cs.task1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);
        double r1 = readValue(scanner, "r1");
        double r2 = readValue(scanner, "r2");
        double r3 = readValue(scanner, "r3");
        double area = calcShadedArea(r1, r2, r3);
        System.out.printf(Locale.ROOT, "Shaded area: %.4f%n", area);
    }

    public static double readValue(Scanner scanner, String name) {
        System.out.print("Input " + name + ": ");
        return scanner.nextDouble();
    }

    public static double calcCircleArea(double r) {
        return Math.PI * r * r;
    }

    public static double calcRingArea(double rInner, double rOuter) {
        return calcCircleArea(rOuter) - calcCircleArea(rInner);
    }

    public static double calcCornersArea(double r) {
        double squareSide = 2 * r;
        return squareSide * squareSide - calcCircleArea(r);
    }

    public static double calcShadedArea(double r1, double r2, double r3) {
        double inner = calcCircleArea(r1) / 8;
        double middle = calcRingArea(r1, r2) * 3 / 8;
        double outer = calcRingArea(r2, r3) / 2;
        double corners = calcCornersArea(r3) * 5 / 8;
        return inner + middle + outer + corners;
    }
}
