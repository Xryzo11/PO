package uk.po;

import uk.po.entities.Category;
import uk.po.entities.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Category Test ---");
        Category c1 = Category.from("c1");
        try {
            c1.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            c1.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println(c1);

        System.out.println("--- Product Test ---");
        Product p1 = Product.create("p1", c1, 10.1234f);
        try {
            p1.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            p1.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            p1.setPrice(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            p1.setPrice(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
