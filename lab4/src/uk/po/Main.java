package uk.po;

import uk.po.entities.Category;
import uk.po.entities.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- uk.po.entities.Category tests ---");
        Category c1 = new Category();
        Category c2 = new Category("c2test");

        c1.setName("c1test");
        c2.setName("");
        System.out.println("c1 name: " + c1.getName());
        System.out.println("c2 toString: " + c2);

        System.out.println("\n--- uk.po.entities.Product tests ---");
        Product p1 = new Product();
        Product p2 = new Product("p2test", 0);
        Product p3 = new Product("p3test", c1, 12.3456f);
        Product p4 = new Product("p4test", c2, 78.90123f, Currency.PLN);

        p1.setName("p1test");
        p1.setCategory(c1);
        p1.setPrice(23.4567f);
        p2.setName("");
        p2.setName(null);
        p2.setPrice(-1);
        System.out.println("p1 name: " + p1.getName());
        System.out.println("p1 category name: " + p1.getCategory().getName());
        System.out.println("p1 price: " + p1.getPrice());
        System.out.println("p2 toString: " + p2);
        System.out.println("p3 toString: " + p3);
        System.out.println("p4 toString: " + p4);

        System.out.println("\n--- uk.po.Currency tests ---");
        System.out.println("PLN toString: " + Currency.PLN);
        System.out.println("USD toString: " + Currency.USD);
    }
}
