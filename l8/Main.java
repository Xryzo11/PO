public class Main {
    public static void main(String[] args) {
        /* Product testProduct1 = new Product.Builder()
                .name("a")
                .build();
        System.out.println(testProduct1); */  // zwraca blad - produkt nie moze byc darmowy

        /* Product testProduct2 = new Product.Builder()
                .price(2)
                .build();
        System.out.println(testProduct2); */ // zwraca blad - produkt musi miec nazwe

        Product testProduct3 = new Product.Builder()
                .name("c")
                .price(3)
                .build();
        System.out.println(testProduct3);

        Category testCategory = Category.from("test");

        Product testProduct4 = new Product.Builder()
                .name("d")
                .price(4)
                .category(testCategory)
                .build();
        System.out.println(testProduct4);

        Product testProduct5 = new Product.Builder()
                .name("e")
                .price(5)
                .currency("EUR")
                .build();
        System.out.println(testProduct5);

        Product testProduct6 = new Product.Builder()
                .name("f")
                .price(6)
                .category(testCategory)
                .currency("EUR")
                .build();
        System.out.println(testProduct6);
    }
}
