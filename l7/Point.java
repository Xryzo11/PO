public class Point {
    private final double x;
    private final double y;

    private static Point point1 = new Point(0, 0);
    private static Point point2 = new Point(0, 1);

    public static Point of(double x, double y) {
        return new Point(x, y);
    }

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    Point move(double vx, double vy) {
        return new Point(x + vx, y + vy);
    }

    Point symmetryOx() {
        return new Point(x, -y);
    }

    Point symmetryOy() {
        return new Point(-x, y);
    }

    Point rotate(int degrees) {
        double newX;
        double newY;
        double radians = Math.toRadians(degrees);
        newX = (x * Math.cos(radians)) - (y * Math.sin(radians));
        newX = Math.ceil(newX * 100.0) / 100.0;
        newY = (x * Math.sin(radians)) + (y * Math.cos(radians));
        newY = Math.ceil(newY * 100.0) / 100.0;
        return new Point(newX, newY);
    }
}
