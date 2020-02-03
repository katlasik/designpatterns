package pl.workshop.factorymethod;

import java.util.Objects;

public class Point {

    private final double x;
    private final double y;

    private Point(double x, double y) {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }

    public static Point fromCartesian(double x, double y) {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }

    public static Point fromPolar(double alpha, double r) {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }

    public static Point fromRelative(Point relative, double x, double y) {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
