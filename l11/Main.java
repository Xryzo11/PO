import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Double> doubleList = new SinglyLinkedList<>();
        System.out.println("--- Test listy (double) ---");
        System.out.println("doubleList.add(1.1)");
        doubleList.add(1.1);
        System.out.println("doubleList.add(2.2)");
        doubleList.add(2.2);
        System.out.println("doubleList.add(3.3)");
        doubleList.add(3.3);
        System.out.println("doubleList.add(1, 4.4)");
        doubleList.add(1, 4.4);
        System.out.println("doubleList.add(3, 5.5)");
        doubleList.add(3, 5.5);
        System.out.println("doubleList.add(5, 6.6)");
        doubleList.add(5, 6.6);
        System.out.println("doubleList.add(10, 7.7)");
        try {
            doubleList.add(10, 7.7);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("doubleList.add(-1, 8.8)");
        try {
            doubleList.add(-1, 8.8);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println("doubleList.size(): " + doubleList.size());
        System.out.println("doubleList.toString(): " + doubleList);
        System.out.println("doubleList.get(0): " + doubleList.get(0));
        System.out.println("doubleList.get(3): " + doubleList.get(3));
        System.out.println("doubleList.get(10): ");
        try {
            System.out.println(doubleList.get(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("doubleList.contains(5.5): " + doubleList.contains(5.5));
        System.out.println("doubleList.indexOf(3.3): " + doubleList.indexOf(3.3));
        System.out.print("doubleList.indexOf(9.9): " + doubleList.indexOf(9.9));
        System.out.println();
        System.out.println("doubleList.toString(): " + doubleList);
        System.out.println("doubleList.remove(2): " + doubleList.remove(2));
        System.out.print("doubleList.remove(10): ");
        try {
            System.out.println(doubleList.remove(10));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("doubleList.toString(): " + doubleList);
        System.out.println("doubleList.size(): " + doubleList.size());
        System.out.println();
        System.out.println("doubleList.isEmpty(): " + doubleList.isEmpty());
        System.out.print("doubleList.clear(), toString(): ");
        doubleList.clear();
        System.out.println(doubleList);
        System.out.println("doubleList.isEmpty(): " + doubleList.isEmpty());
        System.out.println("doubleList.size(): " + doubleList.size());
    }
}
