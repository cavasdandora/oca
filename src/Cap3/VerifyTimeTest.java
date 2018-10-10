package Cap3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;


class VerifyTimeTest {

    @Test
    void isIntraday_SOD_SameDay_EOD_InPast_BeforeSOD() {
        LocalTime startTime = LocalTime.of(10, 00, 00);
        LocalTime endTime = LocalTime.of(16, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 9, 59, 59);


        VerifyTime time1 = new VerifyTime();
        Assertions.assertEquals(false, time1.isIntraday(startTime, endTime, date));
    }

    @Test
    void isIntraday_SOD_SameDay_EOD_InPast_BeforeSOD1() {
        LocalTime startTime = LocalTime.of(10, 00, 00);
        LocalTime endTime = LocalTime.of(16, 00, 00);
        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 9, 59, 59);


        VerifyTime time1 = new VerifyTime();
        Assertions.assertEquals(true, time1.isIntraday(startTime, endTime, date));
    }
}