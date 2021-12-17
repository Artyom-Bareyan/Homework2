package lesson9;

public class Box {

    double width;
    double height;
    double depth;

//    void volume() {
//        System.out.print("volume:");
//        System.out.println(width * height * depth);

    double volume() {
        double vol = width * height * depth;
        return vol;

    }

    void setDim(double w, double h, double d ) {

        width = w;
        height = h;
        depth = d;

    }
}
