public class Main {
    public static void main(String[] args) {
        System.out.println("--- Category tests ---");
        Category c1 = new Category();
        Category c2 = new Category("c2test");

        c1.setName("c1test");
        c2.setName("");
        System.out.println("c1 name: " + c1.getName());
        System.out.println("c2 toString: " + c2);

        System.out.println("\n--- Product tests ---");
        Product p1 = new Product();
        Product p2 = new Product("p2test", c2, 12.3456f);

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
    }
}
