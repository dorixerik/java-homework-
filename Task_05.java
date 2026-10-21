import java.util.Scanner;

/**
 * Задача 5, вариант 5 (h >= 3)
 * Рисуем треугольник:
 * *
 * |\
 * | \
 * |  \
 * *---*
 *

public class Task5 {

    /**
     * Печатает фигуру высотой h (h >= 3)
     */
    public static void printFigure(int h) {
        // Верхняя строка - одна звёздочка
        System.out.println("*");

        // Средние строки: "|", потом пробелы, потом "\"
        // В строке с номером i перед "\" стоит (i - 1) пробел
        for (int i = 1; i <= h - 2; i++) {
            System.out.print("|");
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }

        // Нижняя строка: "*", (h - 2) минусов, "*"
        System.out.print("*");
        for (int j = 1; j <= h - 2; j++) {
            System.out.print("-");
        }
        System.out.println("*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите h (h >= 3): ");
        int h = scanner.nextInt();
        // Пока введено неправильное значение - спрашиваем снова
        while (h < 3) {
            System.out.print("h должно быть не меньше 3, введите ещё раз: ");
            h = scanner.nextInt();
        }

        printFigure(h);
    }
