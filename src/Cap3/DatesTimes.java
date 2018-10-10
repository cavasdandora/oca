package Cap3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesTimes {
    public static void main(String[] args){

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());


//        public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
//        public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
//        public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos)
//        public static LocalDateTime of(int year, Month month,
//        int dayOfMonth, int hour, int minute)
//        public static LocalDateTime of(int year, Month month,
//        int dayOfMonth, int hour, int minute, int second)
//        public static LocalDateTime of(int year, Month month,
//        int dayOfMonth, int hour, int minute, int second, int nanos)
//        public static LocalDateTime of(LocalDate date, LocalTime)

//        12: LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
//        13: System.out.println(date); // 2014-01-20
//        14: date = date.plusDays(2);
//        15: System.out.println(date); // 2014-01-22
//        16: date = date.plusWeeks(1);
//        continued
//        Working with Dates and Times 143
//        17: System.out.println(date); // 2014-01-29
//        18: date = date.plusMonths(1);
//        19: System.out.println(date); // 2014-02-28
//        20: date = date.plusYears(5);
//        21: System.out.println(date); // 2019-02-28
//        22: LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        23: LocalTime time = LocalTime.of(5, 15);
//        24: LocalDateTime dateTime = LocalDateTime.of(date, time);
//        25: System.out.println(dateTime); // 2020-01-20T05:15
//        26: dateTime = dateTime.minusDays(1);
//        27: System.out.println(dateTime); // 2020-01-19T05:15
//        28: dateTime = dateTime.minusHours(10);
//        29: System.out.println(dateTime); // 2020-01-18T19:15
//        30: dateTime = dateTime.minusSeconds(30);
//        31: System.out.println(dateTime); // 2020-01-18T19:14:30

//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        LocalTime time = LocalTime.of(5, 15);
//        LocalDateTime dateTime = LocalDateTime.of(date2, time)
//                .minusDays(1).minusHours(10).minusSeconds(30);
//
//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        date.plusDays(10);
//        System.out.println(date);
//    }
}}
