package uk.po.entities;

public class Category {
    private String name;

    public Category() {}
    public Category(String name) {
        setName(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() <= 0) {
            this.name = null;
            return;
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "uk.po.entities.Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
