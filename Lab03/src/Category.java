public class Category {
    private String name;

    public Category() {}
    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() <= 0) {
            System.out.println("Niepoprawna nazwa");
            return;
        }
        System.out.println("Zmieniono nazwe");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
