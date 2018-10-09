package Cap3;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;


public class VerifyTime {


    public void testLocalDateTime(LocalTime startTime, LocalTime endTime, LocalDateTime date) {

        if (date.toLocalTime().isAfter(startTime) && (date.toLocalTime().isBefore(endTime))) {

            System.out.print("your date is intradate");
        } else {
            System.out.print("your date is extradate");
        }

    }

    public static void main(String args[]) {
        VerifyTime time1 = new VerifyTime();

        LocalTime startTime = LocalTime.of( 16, 00, 00);
        LocalTime endTime = LocalTime.of( 10, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 16, 01, 00);

        System.out.print(date.toLocalDate());







        time1.testLocalDateTime(startTime, endTime, date);


    }
}