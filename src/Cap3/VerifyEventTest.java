package Cap3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;


class VerifyEventTest {
    @Test
    void isEventhappening_afterSOD_afterEventTime() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalTime event = LocalTime.of(8, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 23, 59, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(true, e.isEventhappening(startTime, date, event));
    }


    @Test
    void isEventhappening_afterSOD_afterEvent() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalTime event = LocalTime.of(8, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 13, 40, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(true, e.isEventhappening(startTime, date, event));
    }


    @Test
    void isEventhappening_beforeSOD() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalTime event = LocalTime.of(8, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 6, 59, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(false, e.isEventhappening(startTime, date, event));
    }

    @Test
    void isEventhappening_afterSOD_beforeEventTime() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalTime event = LocalTime.of(8, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 7, 01, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(false, e.isEventhappening(startTime, date, event));
    }

    @Test
    void isEventhappening_beforeSOD2() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalTime event = LocalTime.of(8, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 1, 59, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(false, e.isEventhappening(startTime, date, event));
    }

    @Test
    void isEventhappening_beforeSOD_atMidnight() {
        LocalTime startTime = LocalTime.of(7, 00, 00);
        LocalTime endTime = LocalTime.of(7, 00, 00);
        LocalTime event = LocalTime.of(8, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 0, 01, 00);

        VerifyEvent e = new VerifyEvent();
        Assertions.assertEquals(false, e.isEventhappening(startTime, date, event));
    }

}