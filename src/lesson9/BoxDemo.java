package lesson9;

public class BoxDemo {
    public static void main(String[] args) {

        Box myBox = new Box();
        Box myBox1 = new Box();
        double vol;


        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        double volume = myBox.volume();
        System.out.println(volume);
        if (volume > 7000) {
            System.out.println(volume);

        }
        vol = myBox.width * myBox.depth * myBox.height;
        System.out.println("vol=" + vol);


        myBox1.width = 3;
        myBox1.height = 6;
        myBox1.depth = 9;
        myBox1.volume();
        double volume1 = myBox1.volume();
        System.out.println(myBox1.volume());
        if (volume > volume1) {


        }
        vol = myBox1.width * myBox1.depth * myBox1.height;
        System.out.println("vol=" + vol);


    }
}
