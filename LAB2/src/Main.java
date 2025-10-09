public class Main {
    public static void main(String[] args) {
        Category c1 = new Category();
        Category c2 = new Category("test2");

        c1.setName("test1");
        c2.setName("");
        System.out.println("");
        System.out.println("c1 name: " + c1.getName());
        System.out.println("c2 toString: " + c2);
    }
}
