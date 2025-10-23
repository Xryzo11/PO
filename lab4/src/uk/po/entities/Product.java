package uk.po.entities;

import uk.po.Currency;

public class Product {
    private String name;
    private Category category;
    private float price;
    private Currency currency = Currency.PLN;

    public Product() {
        this(null, null, 0, null);
    }
    public Product(String name, float price) {
        this(name, null, price, null);
    }
    public Product(String name, Category category, float price) {
        this(name, category, price, null);
    }
    public Product(String name, Category category, float price, Currency currency) {
        setName(name);
        setCategory(category);
        setPrice(price);
        setCurrency(currency);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() <= 0) {
            this.name = null;
            return;
        }
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
        if (price <= 0) {
            this.price = 0;
            return;
        }
        this.price = price;
    }

    public void setCurrency(Currency currency) {
        if (currency == null) {
            this.currency = Currency.PLN;
            return;
        }
        this.currency = currency;
    }

    public Currency getCurrency() {
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
}
