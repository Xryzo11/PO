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

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solid solid = (Solid) o;
        return unit == solid.unit;
    }

    public abstract double volume();
    public abstract double surfaceArea();
}
