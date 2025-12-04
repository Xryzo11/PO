public class Cuboid extends Solid {
    private double a;
    private double b;
    private double c;

    public Cuboid(Unit unit, double a, double b, double c) {
        super(unit);
        Validator validator = Validator.getInstance();
        validator.validatePositive(a);
        validator.validatePositive(b);
        validator.validatePositive(c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double volume() {
        return a * b * c;
    }

    @Override
    public double surfaceArea() {
        return 2 * (a * b + b * c + a * c);
    }

    public boolean equals(Cuboid other, double tolerance) {
        return Math.abs(this.a - other.a) <= tolerance &&
               Math.abs(this.b - other.b) <= tolerance &&
               Math.abs(this.c - other.c) <= tolerance &&
               this.unit == other.unit;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", unit=" + unit +
                '}';
    }
}
