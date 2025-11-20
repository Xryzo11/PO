public class Product {
    private String name;
    private Category category;
    private float price;
    private String currency = "PLN";

    public static Product create(String name, Category category, float price, String currency) {
        if (category != null) {
            return new Product(name, category, price, currency);
        }
        return new Product(name, price, currency);
    }

    private Product(String name, float price, String currency) {
        this(name, null, price, currency);
    }
    private Product(String name, Category category, float price, String currency) {
        setName(name);
        setCategory(category);
        setPrice(price);
        setCurrency(currency);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        StringValidator.getInstance().validate(name);
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        price = (float) Math.ceil(price * 100) / 100;
        PriceValidator.getInstance().validate(price);
        this.price = price;
    }

    public void setCurrency(String currency) {
        if (currency == null) {
            this.currency = "PLN";
            return;
        }
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("uk.po.entities.Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", category=").append(category);
        sb.append(", price=").append(price);
        sb.append(", currency=").append(currency);
        sb.append('}');
        return sb.toString();
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
            if (value == null) throw new IllegalArgumentException("Nazwa produktu nie może mieć wartości NULL");
            else if (value.isEmpty()) throw new IllegalArgumentException("Nazwa produktu nie może być pusta");
        }
    }

    private static class PriceValidator {
        private static PriceValidator INSTANCE;

        private PriceValidator() {}

        public static PriceValidator getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new PriceValidator();
            }
            return INSTANCE;
        }

        public void validate(float value) {
            if (value == 0) throw new IllegalArgumentException("Produkt nie może być darmowy");
            else if (value < 0 ) throw new IllegalArgumentException("Cena nie może być ujemna");
        }
    }

    public static class Builder {
        private String name;
        private Category category;
        private float price;
        private String currency = "PLN";

        public Builder() {}

        public Product build() {
            return Product.create(name, category, price, currency);
        }

        public Builder name(String name) {
            StringValidator.getInstance().validate(name);
            this.name = name;
            return this;
        }

        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        public Builder price(float price) {
            PriceValidator.getInstance().validate(price);
            this.price = price;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }
    }
}
