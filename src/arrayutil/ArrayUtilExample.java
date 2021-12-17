package arrayutil;

public class ArrayUtilExample {

    public static void main(String[] args) {

        int[] array = {13, 18, 8, 30, 11, 14, 7, 12, 3, 31};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        {

            System.out.println();
            int max = array[0];
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                }

            }
            System.out.print("max = " + max);
            {
                System.out.println();
                int min = array[0];
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }

                }
                System.out.println("min =" + min);

            }
            {

                int evenCount = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        System.out.print(array[i] + " ");

                    }
                    System.out.println("evenCount"+ evenCount);




                            }

                        }

                    }
                }
            }

