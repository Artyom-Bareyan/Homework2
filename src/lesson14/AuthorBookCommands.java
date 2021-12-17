package lesson14;

public interface AuthorBookCommands {

    public static final String EXIT = "0";
    public static final String ADD_AUTHORS = "1";
    public static final String ADD_BOOK = "2";
    public static final String SEARCH_AUTHORS = "3";
    public static final String SEARCH_AUTHORS_BY_AGE = "4";
    public static final String SEARCH_AUTHORS_BY_TITLE = "5";
    public static final String SEARCH_BOOKS_BY_AUTHOR = "6";
    public static final String COUNT_BOOKS_BY_AUTHOR = "7";
    public static final String PRINT_AUTHORS = "8";
    public static final String PRINT_BOOKS = "9";
    public static final String CHANGE_AUTHOR = "10";
    public static final String CHANGE_BOOK_AUTHOR = "11";
    public static final String DELETE_AUTHOR = "12";
    public static final String DELETE_BOOK = "13";
    public static final String DELETE_BOOK_BY_AUTHOR = "14";
    String ADD_TAG_TO_BOOK = "15";
    String REMOVE_TAGS_FROM_BOOK = "16";
    //    user commands
    String LOGOUT = "00";
    String LOGIN = "1";
    String REGISTER = "2";

    static void printCommands() {
        System.out.println("please input" + EXIT + " for EXIT");
        System.out.println("please input" + LOGIN + " for LOGIN");
        System.out.println("please input" + REGISTER + " for REGISTER");
    }

    static void printAdminCommands() {
        System.out.println("please input" + EXIT + " for EXIT");
        System.out.println("please input" + ADD_AUTHORS + " for add author");
        System.out.println("please input" + ADD_BOOK + " for add book");
        System.out.println("please input" + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input" + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input" + SEARCH_AUTHORS_BY_TITLE + " for search book by title");
        System.out.println("please input" + PRINT_AUTHORS + " for print authors ");
        System.out.println("please input" + PRINT_BOOKS + " for print books ");
        System.out.println("please input" + SEARCH_BOOKS_BY_AUTHOR + " for SEARCH_BOOKS_BY_AUTHOR ");
        System.out.println("please input" + COUNT_BOOKS_BY_AUTHOR + " for COUNT_BOOKS_BY_AUTHOR ");
        System.out.println("please input" + CHANGE_AUTHOR + " for CHANGE_AUTHOR ");
        System.out.println("please input" + CHANGE_BOOK_AUTHOR + " for CHANGE_BOOK_AUTHOR ");
        System.out.println("please input" + DELETE_AUTHOR + " for DELETE_AUTHOR ");
        System.out.println("please input" + DELETE_BOOK + " for DELETE_BOOK ");
        System.out.println("please input" + DELETE_BOOK_BY_AUTHOR + " for DELETE_BOOK_BY_AUTHOR ");
        System.out.println("please input" + ADD_TAG_TO_BOOK + " for ADD_TAG_TO_BOOK ");
        System.out.println("please input" + REMOVE_TAGS_FROM_BOOK + " for REMOVE_TAG_TO_BOOK ");
        System.out.println("please input" + LOGOUT + " for LOGOUT ");


    }

    static void printUserCommands() {
        System.out.println("please input" + EXIT + " for EXIT");
        System.out.println("please input" + ADD_AUTHORS + " for add author");
        System.out.println("please input" + ADD_BOOK + " for add book");
        System.out.println("please input" + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input" + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input" + SEARCH_AUTHORS_BY_TITLE + " for search book by title");
        System.out.println("please input" + PRINT_AUTHORS + " for print authors ");
        System.out.println("please input" + PRINT_BOOKS + " for print books ");
        System.out.println("please input" + SEARCH_BOOKS_BY_AUTHOR + " for SEARCH_BOOKS_BY_AUTHOR ");
        System.out.println("please input" + COUNT_BOOKS_BY_AUTHOR + " for COUNT_BOOKS_BY_AUTHOR ");
        System.out.println("please input" + LOGOUT + " for LOGOUT ");


    }
}

