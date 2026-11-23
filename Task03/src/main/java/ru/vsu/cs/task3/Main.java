package ru.vsu.cs.task3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final Circle C1 = new Circle(-5, 6, 3);
    public static final VerticalParabola P1 = new VerticalParabola(-6, 3, -0.5);
    public static final VerticalParabola P2 = new VerticalParabola(0, 2, -0.25);
    public static final HorizontalLine L1 = new HorizontalLine(-4);

    public static SimpleColor getColor(double x, double y) {
        if (C1.isPointInside(x, y)) {
            return SimpleColor.ORANGE;
        }
        boolean insideP1 = !P1.isPointAboveParabola(x, y);
        boolean insideP2 = !P2.isPointAboveParabola(x, y);
        if (L1.isPointAboveLine(x, y)) {
            if (insideP1 && insideP2) {
                return SimpleColor.YELLOW;
            }
            if (insideP2) {
                return SimpleColor.GRAY;
            }
            return SimpleColor.BLUE;
        }
        if (insideP1) {
            return SimpleColor.WHITE;
        }
        if (insideP2) {
            return SimpleColor.GREEN;
        }
        if (x > 0) {
            return SimpleColor.ORANGE;
        }
        return SimpleColor.BLUE;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf(Locale.ROOT, "(%.1f, %.1f) -> %s%n", x, y, getColor(x, y));
    }

    public static void main(String[] args) {
        printColorForPoint(-5, 6);
        printColorForPoint(5, 5);
        printColorForPoint(-6, 1);
        printColorForPoint(-3, -3);
        printColorForPoint(0, 0);
        printColorForPoint(-6, -6);
        printColorForPoint(-3, -8);
        printColorForPoint(-10, -6);
        printColorForPoint(2, -6);
        printColorForPoint(8, -6);

        Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);
        System.out.print("Input X: ");
        double x = scanner.nextDouble();
        System.out.print("Input Y: ");
        double y = scanner.nextDouble();
        printColorForPoint(x, y);
    }
}
