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
        StringValidator.getInstance().validate(name);
        this.name = name;
    }



    @Override
    public String toString() {
        return "uk.po.entities.Category{" +
                "name='" + name + '\'' +
                '}';
    }

    private static class StringValidator {
        private static StringValidator INSTANCE;

        private StringValidator() {}

        public static StringValidator getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new StringValidator();
            }
            return INSTANCE;
        }

        public void validate(String value) {
            if (value == null) throw new IllegalArgumentException("Argument nie może mieć wartości NULL");
            else if (value.isEmpty()) throw new IllegalArgumentException("Argument nie może być pusty");
        }
    }
}
