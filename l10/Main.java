public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testy klasy Cuboid ===");
        Cuboid cuboid = new Cuboid(Solid.Unit.cm, 5, 3, 2);
        System.out.println("Objętość: " + cuboid.volume() + " " + cuboid.getUnit() + "3");
        System.out.println("Pole powierzchni: " + cuboid.surfaceArea() + " " + cuboid.getUnit() + "2");
        System.out.print("\n");
        Cuboid cuboid2 = new Cuboid(Solid.Unit.cm, 5.1, 3, 2);
        System.out.println("cuboid.equals(cuboid2, 0.01): " + cuboid.equals(cuboid2, 0.01));
        System.out.println("cuboid.equals(cuboid2, 0.02): " + cuboid.equals(cuboid2, 0.2));
        System.out.print("\n");
        System.out.println("cuboid: " + cuboid);
        System.out.println("cuboid2: " + cuboid2);

        System.out.println("\n\n=== Testy klasy Cone ===");
        Cone cone = new Cone(Solid.Unit.m, 3, 4);
        System.out.println("Objętość: " + cone.volume() + " " + cone.getUnit() + "3");
        System.out.println("Pole powierzchni: " + cone.surfaceArea() + " " + cone.getUnit() + "2");
        System.out.print("\n");
        Cone cone2 = new Cone(Solid.Unit.m, 3.05, 4);
        System.out.println("cone.equals(cone2, 0.1): " + cone.equals(cone2, 0.1));
        System.out.println("cone.equals(cone2, 0.01): " + cone.equals(cone2, 0.01));
        System.out.print("\n");
        System.out.println("cone: " + cone);
        System.out.println("cone2: " + cone2);

        System.out.println("\n\n=== Test walidatora ===");
        try {
            Cuboid invalid = new Cuboid(Solid.Unit.mm, -5, 3, 2);
        } catch (LessThanZero e) {
            System.out.println(e);
        }
    }
}
