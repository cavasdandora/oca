package Cap3;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class VerifyEvent {

    public boolean isEventhappening(LocalTime startTime, LocalTime endTime, LocalDateTime date) {
        if (date.isBefore(LocalDateTime.MAX)) {

            if ((date.toLocalTime().isAfter(startTime))) {
                return true;


            } else if ((date.toLocalTime().isBefore(startTime))) {
                return false;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        VerifyEvent e = new VerifyEvent();

        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 0, 01, 00);
        //1 OCT       TRUE:  07:00 - 23:59
        //            FALSE: 00:00 - 06.59


        assert e.isEventhappening(startTime, endTime, date) == false;

    }
}