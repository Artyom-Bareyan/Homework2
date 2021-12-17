package lesson6;

public class SwitchExample {
    public static void main(String[] args) {
        String country = "USA";

        String language = "";
        switch (country) {
            case "Armenia":
                language = "hy";
                break;
            case "Rassia":
                language = "Ru";
                break;
            case "USA":
                language = "EN";
                break;
            default:
                language = "ES";
        }
        System.out.println("language = " + language);
    }
}
