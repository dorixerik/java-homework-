/**
 * Прямоугольник со сторонами, параллельными осям координат
 */
public class Rectangle {

    public double xLeft;
    public double yBottom;
    public double xRight;
    public double yTop;

    public Rectangle(double xLeft, double yBottom, double xRight, double yTop) {
        this.xLeft = xLeft;
        this.yBottom = yBottom;
        this.xRight = xRight;
        this.yTop = yTop;
    }

    /**
     * Проверяет, находится ли точка (x, y) внутри прямоугольника
     */
    public boolean isPointInside(double x, double y) {
        return x > xLeft && x < xRight && y > yBottom && y < yTop;
    }
}