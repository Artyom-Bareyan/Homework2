package lesson15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

    public static void main(String[] args) throws ParseException {
//        01/12/2021   21:13:44
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
//        Date date = new Date();
//        System.out.println(sdf.format(date));

        String dateStr = "01/12/2021";
        Date parse = sdf.parse(dateStr);
        System.out.println(parse);

    }

}
