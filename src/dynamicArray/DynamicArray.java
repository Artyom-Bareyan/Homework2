package dynamicArray;

public class DynamicArray {
    //        DynamicArray da = new DynamicArray();

    //        sa mer himnakan masivn e ,vortex pahelu enq avelacnox elementnera
    private int[] array = new int[10];

    //        sa mer masivi mej avelacvac elementneri qanakn e
    private int size = 0;


    //       stugel ete masivi mej tex chka-> avelacnel Kanchel Extend()
//    ev avelacnenq
    public void add(int value) {
        if (array.length == size) {
            extend();
        }
        array[size++] = value;

    }

    //   1. stexcel hin masivic 10 element aveli mec masiv
//    2. qcel hin masivi elementnera nori mej
//hin masivi hxuma kapenq nor masivi hxman het
    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];

        }

        array = tmp;
    }

    //    ete mer trvac indexa mer unecac indexi sahmannerum e ,
//    veradarcnel masivi index-errord elementa: hakarak depqum veradarcnel -1.
    public int getByIndex(int index) {
        if (index< 0 || index  > size) {
            System.err.println("invalid index");
            return -1;

        }
        return array[index];
    }

    //    tpel masivi avelacvac elementnera
    public void print() {

    }
}

