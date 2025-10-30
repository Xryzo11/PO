package uk.po.entities;

public class Category {
    private String name;

    public static Category from(String name) {
        return new Category(name);
    }

    private Category(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("Argument nie może mieć wartości NULL");
        else if (name.isEmpty()) throw new IllegalArgumentException("Argument nie może być pusty");
        this.name = name;
    }

    @Override
    public String toString() {
        return "uk.po.entities.Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
