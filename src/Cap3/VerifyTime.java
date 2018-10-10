package Cap3;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;


public class VerifyTime {

        public void testLocalDateTime(LocalTime startTime, LocalTime endTime, LocalDateTime date) {


            LocalDate time = date.toLocalDate();

            if ((startTime.getHour() < endTime.getHour()) &&
                    (date.toLocalTime().isAfter(startTime) && date.toLocalTime().isBefore(endTime))) {
                System.out.println("Intraday on date: " + time + " at: " + date.toLocalTime() +
                        " between intervals: " + startTime + " - " + endTime);
            } else {
                System.out.println("Extraday: " + time.plusDays(1) + " at: " + date.toLocalTime() +
                        " between intervals: " + startTime + " - " + endTime);
            }

        }


        public static void main(String args[]) {
            VerifyTime time1 = new VerifyTime();

            LocalTime startTime = LocalTime.of(12, 00, 00);
            LocalTime endTime = LocalTime.of(10, 00, 00);
            LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 11, 01, 00);


            time1.testLocalDateTime(startTime, endTime, date);


        }
    }
