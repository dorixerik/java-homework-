import java.util.Scanner;

/**
 * Задача 3, вариант 5
 */
public class Program {

    // Фигуры из рисунка варианта 5
    // Линия y = 4 * (x - 0) + 6
    public static final Line L5 = new Line(0, 6, 4);
    // Прямоугольник: x от -3 до 7, y от 0 до 8
    public static final Rectangle R5 = new Rectangle(-3, 0, 7, 8);
    // Круг с центром (-2, 3) и радиусом 2
    public static final Circle C5 = new Circle(-2, 3, 2);

    /**
     * Возвращает цвет области, в которую попала точка (x, y)
     */
    public static SimpleColor getColor(double x, double y) {
        // Точка выше линии (слева от неё)
        if (L5.isPointAboveLine(x, y)) {
            if (R5.isPointInside(x, y)) {
                return SimpleColor.GREEN;
            }
            return SimpleColor.WHITE;
        }

        // Точка ниже линии (справа от неё)
        if (R5.isPointInside(x, y)) {
            if (C5.isPointInside(x, y)) {
                return SimpleColor.BLUE;
            }
            return SimpleColor.ORANGE;
        }
        return SimpleColor.BLUE;
    }

    /**
     * Печатает цвет для точки (x, y)
     */
    public static void printColorForPoint(double x, double y) {
        System.out.println("(" + x + ", " + y + ") -> " + getColor(x, y));
    }

    public static void main(String[] args) {
        // Заранее выбранные точки (по одной в каждой области)
        printColorForPoint(-6, 5);      // слева от линии, вне прямоугольника
        printColorForPoint(-8, -8);     // слева от линии, внизу
        printColorForPoint(-2, 5);      // выше линии, в прямоугольнике
        printColorForPoint(2, 3);       // ниже линии, в прямоугольнике, вне круга
        printColorForPoint(-0.5, 2);    // ниже линии, в прямоугольнике и в круге
        printColorForPoint(5, -5);      // справа от линии, вне прямоугольника
        printColorForPoint(9, 9);       // справа вверху, вне прямоугольника

        // Произвольная точка с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input X: ");
        double x = scanner.nextDouble();
        System.out.print("Input Y: ");
        double y = scanner.nextDouble();
        printColorForPoint(x, y);
    }
}