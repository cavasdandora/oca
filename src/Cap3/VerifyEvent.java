package Cap3;

import java.time.*;

public class VerifyEvent {




    public boolean isEventhappening(LocalTime startTime,LocalDateTime date, LocalTime event) {


        if (date.toLocalTime().isBefore(startTime)) {

            System.out.println("date: " + date.toLocalDate().minusDays(1) + " " + startTime);
           return false;

        } else if((date.toLocalTime().isAfter(startTime)) && (date.toLocalTime().isAfter(event))) {
            System.out.println("date: " + date.toLocalDate() + " " + startTime);
            return true;
        }
        else if ((date.toLocalTime().isAfter(startTime)) && (date.toLocalTime().isBefore(event))){
            System.out.println("date: " + date.toLocalDate() + " " + startTime);
            return false;
        }
return false;
    }
    public static void main(String[] args) {

        VerifyEvent e = new VerifyEvent();


        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime event = LocalTime.of(8, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 9, 8, 30, 00);

        e.isEventhappening(startTime, date, event);



    }
}