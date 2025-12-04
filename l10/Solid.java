public abstract class Solid {
    public enum Unit {
        mm, cm, dm, m;

        @Override
        public String toString() {
            return this.name();
        }
    }

    protected Unit unit;

    public Solid(Unit unit) {
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public abstract double volume();
    public abstract double surfaceArea();
}
