package ru.vsu.cs.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input w (w >= 3): ");
        int w = scanner.nextInt();
        System.out.print("Input h (h >= 4, even): ");
        int h = scanner.nextInt();
        if (w < 3 || h < 4 || h % 2 != 0) {
            System.out.println("Incorrect parameters");
            return;
        }
        printFigure(w, h);
    }

    public static void printBorder(int w) {
        System.out.print('*');
        for (int j = 0; j < w - 2; j++) {
            System.out.print('-');
        }
        System.out.println('*');
    }

    public static void printFigure(int w, int h) {
        int innerHeight = h - 2;
        int half = innerHeight / 2;
        printBorder(w);
        for (int i = 0; i < innerHeight; i++) {
            int shift = i < half ? i : innerHeight - 1 - i;
            char symbol = i < half ? '\\' : '/';
            System.out.print('|');
            for (int j = 0; j < w - 2; j++) {
                if ((shift + j) % 2 == 0) {
                    System.out.print(symbol);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println('|');
        }
        printBorder(w);
    }
}
