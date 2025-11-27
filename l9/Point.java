public class Point {
    private final double x;
    private final double y;
    private final double z;

    public static final Point point0 = new Point(0.0, 0.0, 0.0);
    public static final Point point1 = new Point(1.0, 1.0, 1.0);

    private Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")";
    }

    public Point move(double vx, double vy, double vz) {
        double newX = this.x + vx;
        double newY = this.y + vy;
        double newZ = this.z + vz;
        NonNegativeNumberValidator.getInstance().validateOutput(newX);
        NonNegativeNumberValidator.getInstance().validateOutput(newY);
        NonNegativeNumberValidator.getInstance().validateOutput(newZ);
        return new Point(newX, newY, newZ);
    }

    public Point symmetryOxy(double z0) {
        double newZ = 2 * z0 - z;
        NonNegativeNumberValidator.getInstance().validateOutput(newZ);
        return new Point(x, y, newZ);
    }

    public Point symmetryO(double x, double y, double z) {
        double newX = 2 * x - this.x;
        double newY = 2 * y - this.y;
        double newZ = 2 * z - this.z;
        NonNegativeNumberValidator.getInstance().validateOutput(newX);
        NonNegativeNumberValidator.getInstance().validateOutput(newY);
        NonNegativeNumberValidator.getInstance().validateOutput(newZ);
        return new Point(newX, newY, newZ);
    }

    public static class Builder {
        private double x = 0.0;
        private double y = 0.0;
        private double z = 0.0;

        public Builder() {}

        public Point build() {
            return new Point(x, y, z);
        }

        public Builder x(double value) {
            NonNegativeNumberValidator.getInstance().validateInput(value);
            x = value;
            return this;
        }

        public Builder y(double value) {
            NonNegativeNumberValidator.getInstance().validateInput(value);
            y = value;
            return this;
        }

        public Builder z(double value) {
            NonNegativeNumberValidator.getInstance().validateInput(value);
            z = value;
            return this;
        }
    }
}
