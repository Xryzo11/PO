public class Product {
    private String name;
    private Category category;
    private float price;

    public Product() {}
    public Product(String name, Category category, float price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() <= 0) {
            System.out.println("Niepoprawna nazwa");
            return;
        }
        System.out.println("Zmieniono nazwe");
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        System.out.println("Zmieniono kategorie");
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        price = (float) Math.floor(price * 100) / 100;
        if (price <= 0) {
            System.out.println("Niepoprawna cena");
            return;
        }
        System.out.println("Zmieniono cene");
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("name='").append(name).append('\'');
        sb.append(", category=").append(category);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
