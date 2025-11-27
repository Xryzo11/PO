public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testy stałych punktów ---");
        System.out.println("Point.point0: " + Point.point0);
        System.out.println("Point.point1: " + Point.point1);

        System.out.println("\n--- Testy tworzenia punktów ---");
        Point testPoint1 = new Point.Builder().build();
        System.out.println("testPoint1: " + testPoint1);
        Point testPoint2 = new Point.Builder().x(1).build();
        System.out.println("testPoint2: " + testPoint2);
        Point testPoint3 = new Point.Builder().y(2).build();
        System.out.println("testPoint3: " + testPoint3);
        Point testPoint4 = new Point.Builder().z(3).build();
        System.out.println("testPoint4: " + testPoint4);
        Point testPoint5 = new Point.Builder().x(4).y(5).z(6).build();
        System.out.println("testPoint5: " + testPoint5);
        System.out.print("x = -1: ");
        try {
            Point testPoint6 = new Point.Builder().x(-1).build();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("y = -2: ");
        try {
            Point testPoint7 = new Point.Builder().y(-2).build();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("z = -3: ");
        try {
            Point testPoint8 = new Point.Builder().z(-3).build();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n--- Testy przekształceń ---");
        System.out.println("testPoint5.move(7, 8, 9): " + testPoint5.move(7, 8, 9));
        System.out.print("testPoint5.move(-7, -8, -9): ");
        try {
            System.out.println(testPoint5.move(-7, -8, -9));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("testPoint5.symmetryOxy(5): " + testPoint5.symmetryOxy(5));
        System.out.print("testPoint5.symmetryOxy(-5): ");
        try {
            System.out.println(testPoint5.symmetryOxy(-5));
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("testPoint5.SymmetryO(3, 3, 3): " + testPoint5.symmetryO(3, 3, 3));
        System.out.print("testPoint5.SymmetryO(-3, -3, -3): ");
        try {
            System.out.println(testPoint5.symmetryO(-3, -3, -3));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n--- Test obliczania odległości ---");
        System.out.println("distanceBetween(testPoint1, testPoint2): " + Triangle.distanceBetween(testPoint1, testPoint2));
        System.out.println("distanceBetween(Point.point0, testPoint5): " + Triangle.distanceBetween(Point.point0, testPoint5));
    }
}
