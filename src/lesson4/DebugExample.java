package lesson4;

public class DebugExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) ;
        System.out.println("*");

        for (int i = 0; i < 5; i++) ;
        {
            System.out.println("* *");
            for (int i = 0; i < 1; i++) {
                System.out.println("* * *");
                for (int j = 0; j < 1; j++) {
                    System.out.println("* * * *");
                    for (int k = 0; k < 1; k++) {
                        System.out.println("* * * * *");

                    }

                }

            }

        }
    }
}

