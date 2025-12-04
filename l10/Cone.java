public class Cone extends Solid {
    private double radius;
    private double height;

    public Cone(Unit unit, double radius, double height) {
        super(unit);
        Validator validator = Validator.getInstance();
        validator.validatePositive(radius);
        validator.validatePositive(height);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    public boolean equals(Cone other, double tolerance) {
        return Math.abs(this.radius - other.radius) <= tolerance &&
               Math.abs(this.height - other.height) <= tolerance &&
               this.unit == other.unit;
    }

    @Override
    public String toString() {
        return "Cone{" +
                "radius=" + radius +
                ", height=" + height +
                ", unit=" + unit +
                '}';
    }
}
