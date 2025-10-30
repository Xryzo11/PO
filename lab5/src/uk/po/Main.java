package uk.po;

import uk.po.entities.Category;
import uk.po.entities.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Category tests");
        Category testCategory = Category.from("testCategory");
        try {
            testCategory.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            testCategory.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println(testCategory);

        System.out.println("--- Product tests ---");
        Product testProduct = Product.create("testProduct", testCategory, 1);
        try {
            testProduct.setPrice(0);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            testProduct.setPrice(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            testProduct.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            testProduct.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        System.out.println(testProduct);
    }
}
