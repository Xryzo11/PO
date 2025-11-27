public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;


    public static Triangle of(Point A, Point B, Point C) {
        return new Triangle(A, B, C);
    }
    private Triangle(Point A, Point B, Point C) {
        this.p1 = A;
        this.p2 = B;
        this.p3 = C;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trójkąt  [")
                .append("A").append(p1.toString()).append(", ")
                .append("B").append(p2.toString()).append(", ")
                .append("C").append(p3.toString())
                .append("]");
        String str = sb.toString();
        return str;
    }

    public static double distanceBetween(Point a, Point b) {
        double distance = Math.sqrt(
                Math.pow(
                        (b.getX() - a.getX()),
                        2
                )
                +
                Math.pow(
                        (b.getY() - a.getY()),
                        2
                )
                +
                Math.pow(
                        (b.getZ() - a.getZ()),
                        2
                )
        );
        return distance;
    }
}
