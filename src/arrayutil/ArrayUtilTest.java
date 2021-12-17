package arrayutil;

public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {1, 3, 5, 925, 64, 13, 85};
        arrayUtil.print(array);
        int[] array2 = {1, 3, 5, 95, 64, 13, 85};
        arrayUtil.print(array2);
        int arrayMax = arrayUtil.max(array);
        int arrayMax2 = arrayUtil.max(array2);
        if (arrayMax > arrayMax2) {
            System.out.println("та цыфра которая больше находиться в array" + arrayMax);

        } else {
            System.out.println("та цыфра которая больше находиться аrray2" + arrayMax2);
        }
    }
}
