public class Main {
    public static void main(String[] args) {
        Point p0 = Point.of(0, 0);
        Point p1 = Point.of(3, 1);
        Point p2 = Point.of(5, -7);
        Point p3 = Point.of(-3, 4);
        System.out.println("p0 toString: " + p0);
        System.out.println("p0 x: " + p0.getX());
        System.out.println("p0 y: " + p0.getY());
        System.out.print("\n");
        System.out.println("p1 toString: " + p1);
        System.out.println("p2 toString: " + p2);
        System.out.println("p3 toString: " + p3);
        System.out.print("\n");
        p0 = p0.move(-1, 1);
        System.out.println("p0 reassigned after move(-1, 1): " + p0);
        System.out.println("p1.move(1,-4) toString: " + p1.move(1, -4));
        System.out.println("p2.symmetryOx() toString: " + p2.symmetryOx());
        System.out.println("p3.symmetryOy() toString: " + p3.symmetryOy());
        System.out.print("\n");
        System.out.println("p1.rotate(90) toString: " + p1.rotate(90));
        System.out.println("p1.rotate(-45) toString: " + p1.rotate(-45));
    }
}
