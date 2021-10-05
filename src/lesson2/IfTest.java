package lesson2;

public class IfTest {

    public static void main(String[] args) {
        int a;
        int a2;

        a = 5;
        a2 = a;

        System.out.println("a=" +a);

        a = a * 2;
        System.out.println("a=" + a);
        System.out.println("a2=" + a2);
        if (a < a2) {
            System.out.println("a mec kam havasar e a2 ic");
        }
    }
}