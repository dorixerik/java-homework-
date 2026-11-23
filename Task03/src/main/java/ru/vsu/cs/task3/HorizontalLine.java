package ru.vsu.cs.task3;

public class HorizontalLine {
    public double y0;

    public HorizontalLine(double y0) {
        this.y0 = y0;
    }

    public boolean isPointAboveLine(double x, double y) {
        return y > y0;
    }
}
