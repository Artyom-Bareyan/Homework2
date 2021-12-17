package arrayutil;

import lesson14.model.Book;

public class ArrayUtil {

    public static void deleteByIndex(Book[] books, int i, int size) {
    }

    int max(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
//        System.out.println("max=" + max);
        return max;
    }

    void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
}
