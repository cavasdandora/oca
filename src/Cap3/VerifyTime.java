package Cap3;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;


public class VerifyTime {


    public void testLocalDateTime(LocalTime startTime, LocalTime endTime, LocalDateTime date) {



    }

    public static void main(String args[]) {
        VerifyTime time1 = new VerifyTime();

        LocalTime startTime = LocalTime.of( 10, 00, 00);
        LocalTime endTime = LocalTime.of( 16, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 10, 01, 00);

//        Period p = Period.of(1,1,1);
//        date = date.minus(p);
//        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//        System.out.println(date.format(f));
//
//        String date2 = date.format(f);
//        System.out.println(date2);


       
        time1.testLocalDateTime(startTime, endTime, date);


    }
}