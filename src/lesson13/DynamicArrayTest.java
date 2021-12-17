package lesson13;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray(10);
//        for (int i = 0; i < 10; i++) {
//            dy.add(i + 1);
        System.out.println(dy.isEmpty());
        dy.add(5);
        System.out.println(dy.isEmpty());
        int[] numbers = {33, 44, 55};
        dy.add(numbers);

//        dy.print();
//        dy.delete(4);
        dy.print();
        dy.add(66, 2);
        dy.print();
        System.out.println(dy.isExists(66));
    }
}
