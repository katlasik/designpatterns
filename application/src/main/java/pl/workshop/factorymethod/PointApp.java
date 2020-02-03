package pl.workshop.factorymethod;

/**
 * Zaimplementuj metody fabrykujące:
 *
 * fromCartesian - tworzący punkt ze współrzędnych kartezjańskich x i y.
 * fromPolar - tworzący punkt ze współrzędnych polarnych r i alpha:
 *   x = r * cos(alpha)
 *   y = r * sin(alpha)
 *
 * fromRelative - tworzący punkt z relatywnie do innego punktu  ze współrzędnych kartezjańskich x i y.
 */
public class PointApp {

    public static void main(String[] args) {

        Point p1 = Point.fromCartesian(4, 4);
        Point p2 = Point.fromPolar(45, 4);
        Point p3 = Point.fromRelative(p1, 4, 4);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
