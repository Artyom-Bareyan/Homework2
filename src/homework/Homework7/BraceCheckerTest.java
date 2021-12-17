package homework.Homework7;

public class BraceCheckerTest {
    public static void main(String[] args) {

        String text = "Heloo (from}[Java";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
//        System.out.println("Error: opened [but closed} at 20");


    }
}
