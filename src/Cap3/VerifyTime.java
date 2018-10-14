package Cap3;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class VerifyTime {
    public boolean isIntraday(LocalTime startTime, LocalTime endTime, LocalDateTime date) {


        if ((date.toLocalTime().isAfter(startTime) && date.toLocalTime().isBefore(endTime))) {

            return true;

        }
       else if ((date.toLocalTime().isBefore(startTime) && date.toLocalTime().isBefore(endTime))) {

            return true;
        }
        else if ((date.toLocalTime().isAfter(startTime) && date.toLocalTime().isAfter(endTime))) {

            return true;
        }
        else if((date.toLocalTime().isBefore(startTime) && date.toLocalTime().isBefore(endTime))){
            return false;
        }
        else if((date.toLocalTime().isAfter(startTime) && date.toLocalTime().isAfter(endTime))){
            return false;
        }
//
//        else if ((date.isBefore(LocalDateTime.MAX) && (date.toLocalTime().isAfter(startTime)))) {
//            return true;
//
//
//        } else if ((date.isAfter(LocalDateTime.MIN)) && ((date.toLocalTime().isBefore(endTime)))) {
//            return true;
//        } else if ((date.isAfter(LocalDateTime.MIN)) && date.toLocalTime().isAfter(endTime)) {
//            return false;
//        }


        return false;
    }

    public static void main(String args[]) {
        VerifyTime time1 = new VerifyTime();

        LocalTime startTime = LocalTime.of(16, 00, 00);
        LocalTime endTime = LocalTime.of(10, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 10, 01, 00);


        assert time1.isIntraday(startTime, endTime, date) == false;


    }
}
