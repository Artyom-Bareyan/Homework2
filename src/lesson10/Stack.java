package lesson10;

public class Stack {
    int[] array = new int[10];
    int index;

    public Stack() {
        index = -1;

    }

    public void push(int item) {
        if (index == 9) {
            System.out.println("Stack is full");
        } else {
            array[++index] = item;
        }
    }

    public int pop() {
        if (index < 0) {
            System.out.println("Stack is emty ");
            return 0;
        } else {

            return array[index--];


        }
    }

    public boolean isEmpty() {
        return index == -1;
    }
}