package pl.workshop.factorymethod;

import java.util.Objects;

public class Point {

    private final double x;
    private final double y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point fromCartesian(double x, double y) {
        return new Point(x, y);
    }

    public static Point fromPolar(double alpha, double r) {
        var x = r * Math.cos(Math.toRadians(alpha));
        var y = r * Math.sin(Math.toRadians(alpha));

        return new Point(x, y);
    }

    public static Point fromRelative(Point relative, double x, double y) {
        return new Point(relative.getX() + x, relative.getY() + y);
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
