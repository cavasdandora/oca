package Cap3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;


class VerifyEventTest {
    //1 OCT       TRUE:  07:00 - 23:59
    //            FALSE: 00:00 - 06.59

    @Test
    void isEventhappening_afterSOD_BeforeMidnight() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 7, 01, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(true, e.isEventhappening(startTime, endTime, date));
    }

    @Test
    void isEventhappening_afterSOD_BeforeMidnight2() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 23, 59, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(true, e.isEventhappening(startTime, endTime, date));
    }
    @Test
    void isEventhappening_afterSOD_AfterMidnight() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 00, 00, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(false, e.isEventhappening(startTime, endTime, date));
    }
    @Test
    void isEventhappening_afterSOD_AfterMidnight2() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 00, 09, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(false, e.isEventhappening(startTime, endTime, date));
    }

    @Test
    void isEventhappening_beforeSOD_BeforeMidnight() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 6, 59, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(false, e.isEventhappening(startTime, endTime, date));
    }

    @Test
    void isEventhappening_beforeSOD_BeforeMidnight2() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 1, 59, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(false, e.isEventhappening(startTime, endTime, date));
    }


}