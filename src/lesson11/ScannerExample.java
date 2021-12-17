package lesson11;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        boolean isWrongCommand = false;
        do {
            isWrongCommand = false;
            System.out.println("please input operation(+,-,*,/");

            Scanner scanner = new Scanner(System.in);
            System.out.println("please input a");
            int a = scanner.nextInt();
            System.out.println("please input b");
            int b = scanner.nextInt();
            System.out.println("please input operation(+,-,*,/");
            String operation = scanner.next();

            int Calculator = scanner.nextInt();
            switch (operation) {
                case "+":
                    System.out.println(calculator.plus(a, b));
                    break;
                case "-":
                    System.out.println(calculator.minus(a, b));
                case "/":
                    System.out.println(calculator.divide(a, b));
                case "*":
                    System.out.println(calculator.multiple(a, b));
                default:isWrongCommand=true;
                    System.out.println("0invalid operation");
            }

        }while (isWrongCommand) ;


    }
}