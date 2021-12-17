package lesson12;

public class Example {
    public static void main(String[] args) {
        String text = "hello(ja{v]a)";
        char[] chars = text.toCharArray();
//        char c = text.charAt(0);
//        System.out.println(c);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);

        }

    }
}
