package Cap3;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class VerifyTime {
    public boolean isIntraday(LocalTime startTime, LocalTime endTime, LocalDateTime date) {


        LocalDate time = date.toLocalDate();

        LocalTime mid = LocalTime.MIDNIGHT;

        if ((startTime.getHour() < endTime.getHour()) &&
                (date.toLocalTime().isAfter(startTime) && date.toLocalTime().isBefore(endTime))) {
            System.out.println("Intraday on date: " + time + " at: " + date.toLocalTime() +
                    " between intervals: " + startTime + " - " + endTime);
            return true;
        } else if (startTime.getHour() > endTime.getHour()
                && ((date.toLocalTime().isAfter(startTime) && (startTime.getHour() > mid.getHour())))) {
            System.out.println("Intraday: " + time + " at: " + date.toLocalTime() +
                    " between intervals: " + startTime + " - " + endTime);
            return true;
        } else if (((startTime.getHour() > endTime.getHour())
                && ((date.toLocalTime().isBefore(endTime)) && (mid.getHour() < endTime.getHour())))) {
            System.out.println("Intraday: " + time.plusDays(1) + " at: " + date.toLocalTime() +
                    " between intervals: " + startTime + " - " + endTime);
            return true;

        } else if (((startTime.getHour() > endTime.getHour())

                && date.toLocalTime().isAfter(endTime) && (mid.getHour() > endTime.getHour()))) {
            System.out.println("Extraday: " + time.plusDays(1) + " at: " + date.toLocalTime() +
                    " between intervals: " + startTime + " - " + endTime);
            return false;

        } else {
            System.out.println("Extraday: " + time + " at: " + date.toLocalTime() +
                    " between intervals: " + startTime + " - " + endTime);
            return false;

        }
    }


    public static void main(String args[]) {
        VerifyTime time1 = new VerifyTime();

        LocalTime startTime = LocalTime.of(10, 00, 00);
        LocalTime endTime = LocalTime.of(16, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 17, 01, 00);


      assert time1.isIntraday(startTime, endTime, date) ==false;



    }
}
