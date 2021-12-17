package lesson12;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("Poxos","Poxosyan", 23, "55555",
                "Java");
        System.out.println(student.getName());
        student.setName("poxosik");
        System.out.println(student.getName());

    }
}
