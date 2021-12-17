package lesson6;

public class ArrayExample {
    public static void main(String[] args) {

        // Haytararel tveri masiv
        int[] numbers = {4, 6, 8, 9, 2};
        // Haytararel simvolneri masiv
        char[] name = {'A', 'R', 'T', 'Y', 'O', 'M', 'B', 'A', 'R', 'E', 'Y', 'A', 'N'};
        int countOfA = 0;
        int countOfR = 0;

        for (int i = 0; i < name.length; i++) {

            char c = name[i];

            if (c == 'A') {
                countOfA++;

            }
            if (c == 'R') {
                countOfR++;}

                System.out.println("count Of A" + countOfA);
                System.out.println("count Of R" + countOfR);
            }

        }

    }
