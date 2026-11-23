package ru.vsu.cs.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Match 1 (home field of team 1), score team1:team2");
        int n1 = readInt(scanner, "N1");
        int m1 = readInt(scanner, "M1");
        System.out.println("Match 2 (home field of team 2), score team1:team2");
        int n2 = readInt(scanner, "N2");
        int m2 = readInt(scanner, "M2");
        int winner = findWinner(n1, m1, n2, m2);
        printResult(winner);
    }

    public static int readInt(Scanner scanner, String name) {
        System.out.print("Input " + name + ": ");
        return scanner.nextInt();
    }

    public static int findWinner(int n1, int m1, int n2, int m2) {
        int goals1 = n1 + n2;
        int goals2 = m1 + m2;
        if (goals1 > goals2) {
            return 1;
        }
        if (goals2 > goals1) {
            return 2;
        }
        int awayGoals1 = n2;
        int awayGoals2 = m1;
        if (awayGoals1 > awayGoals2) {
            return 1;
        }
        if (awayGoals2 > awayGoals1) {
            return 2;
        }
        return 0;
    }

    public static void printResult(int winner) {
        if (winner == 1) {
            System.out.println("Team 1 goes to the next round");
        } else if (winner == 2) {
            System.out.println("Team 2 goes to the next round");
        } else {
            System.out.println("Incorrect data: teams can not be equal");
        }
    }
}
