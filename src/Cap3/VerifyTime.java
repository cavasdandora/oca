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

            return true;
        } else if (startTime.getHour() > endTime.getHour()
                && ((date.toLocalTime().isAfter(startTime) && (startTime.getHour() > mid.getHour())))) {

            return true;
        } else if (((startTime.getHour() > endTime.getHour())
                && ((date.toLocalTime().isBefore(endTime)) && (mid.getHour() < endTime.getHour())))) {

            return true;

        } else if (((startTime.getHour() > endTime.getHour())

                && date.toLocalTime().isAfter(endTime) && (mid.getHour() > endTime.getHour()))) {

            return false;

        } else {

            return false;

        }
    }


    public static void main(String args[]) {
        VerifyTime time1 = new VerifyTime();

        LocalTime startTime = LocalTime.of(10, 00, 00);
        LocalTime endTime = LocalTime.of(16, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 9, 01, 00);


        assert time1.isIntraday(startTime, endTime, date) == false;

        date = LocalDateTime.of(2018, Month.OCTOBER, 1, 11, 01, 00);

        assert time1.isIntraday(startTime, endTime, date) == true;

        date = LocalDateTime.of(2018, Month.OCTOBER, 1, 17, 01, 00);

        assert time1.isIntraday(startTime, endTime, date) == false;

        //------------

        startTime = LocalTime.of(18, 00, 00);
        endTime = LocalTime.of(3, 00, 00);
        date = LocalDateTime.of(2018, Month.OCTOBER, 1, 17, 01, 00);


        assert time1.isIntraday(startTime, endTime, date) == false;

        date = LocalDateTime.of(2018, Month.OCTOBER, 1, 19, 01, 00);

        assert time1.isIntraday(startTime, endTime, date) == true;

        date = LocalDateTime.of(2018, Month.OCTOBER, 1, 2, 01, 00);

        assert time1.isIntraday(startTime, endTime, date) == true;

        date = LocalDateTime.of(2018, Month.OCTOBER, 1, 4, 01, 00);

        assert time1.isIntraday(startTime, endTime, date) == false;


    }
}
