package uk.po;

public enum Currency {
    PLN("Polski złoty"),
    USD("Dolar amerykański");

    private final String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
