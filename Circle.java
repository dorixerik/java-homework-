/**
 * Круг с центром (x0, y0) и радиусом r
 */
public class Circle {

    public double x0;
    public double y0;
    public double r;

    public Circle(double x0, double y0, double r) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
    }

    /**
     * Проверяет, находится ли точка (x, y) внутри круга
     * (расстояние до центра меньше радиуса)
     */
    public boolean isPointInside(double x, double y) {
        double dx = x - x0;
        double dy = y - y0;
        return dx * dx + dy * dy < r * r;
    }
}