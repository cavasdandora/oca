//package Cap3;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.time.LocalDateTime;
//import java.time.LocalTime;
//import java.time.Month;
//
//
//class VerifyTimeTest {
//
//    @Test
//    void isIntraday_SOD_SameDay_EOD_InPast_BeforeSOD() {
//        LocalTime startTime = LocalTime.of(16, 00, 00);
//        LocalTime endTime = LocalTime.of(10, 00, 00);
//        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 10, 01, 00);
//
//        VerifyTime time1 = new VerifyTime();
//        Assertions.assertEquals(false, time1.isIntraday(startTime, endTime, date));
//    }
//
//    @Test
//    void isIntraday_SOD_SameDay_EOD_InPast_BeforeSOD1() {
//        LocalTime startTime = LocalTime.of(16, 00, 00);
//        LocalTime endTime = LocalTime.of(10, 00, 00);
//        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 9, 59, 00);
//
//
//        VerifyTime time1 = new VerifyTime();
//        Assertions.assertEquals(true, time1.isIntraday(startTime, endTime, date));
//    }
//    @Test
//    void isIntraday_SOD_SameDay_EOD_InPast_BeforeSOD2 () {
//        LocalTime startTime = LocalTime.of(16, 00, 00);
//        LocalTime endTime = LocalTime.of(10, 00, 00);
//        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 15, 59, 00);
//
//
//        VerifyTime time1 = new VerifyTime();
//        Assertions.assertEquals(false, time1.isIntraday(startTime, endTime, date));
//    }
//    @Test
//     void isIntraday_SOD_SameDay_EOD_InPast_BeforeSOD3 () {
//                LocalTime startTime = LocalTime.of(16, 00, 00);
//                LocalTime endTime = LocalTime.of(10, 00, 00);
//                LocalDateTime  date = LocalDateTime.of(2018, Month.OCTOBER, 1, 16, 01, 00);
//
//                VerifyTime time1 = new VerifyTime();
//                Assertions.assertEquals(true, time1.isIntraday(startTime, endTime, date));
//    }
//    @Test
//    void isIntraday_SOD_SameDay_EOD_InPast_BeforeSOD35 () {
//        LocalTime   startTime = LocalTime.of(18, 00, 00);
//        LocalTime endTime = LocalTime.of(3, 00, 00);
//        LocalDateTime  date = LocalDateTime.of(2018, Month.OCTOBER, 1, 17, 01, 00);
//
//        VerifyTime time1 = new VerifyTime();
//        Assertions.assertEquals(false, time1.isIntraday(startTime, endTime, date));
//    }
//    @Test
//    void isIntraday_SOD_SameDay_EOD_InPast_BeforeSOD33 () {
//        LocalTime   startTime = LocalTime.of(18, 00, 00);
//        LocalTime endTime = LocalTime.of(3, 00, 00);
//        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 19, 01, 00);
//
//        VerifyTime time1 = new VerifyTime();
//        Assertions.assertEquals(true, time1.isIntraday(startTime, endTime, date));
//    }
//    @Test
//    void isIntraday_SOD_SameDay_EOD_InPast_BeforeSOD37 () {
//        LocalTime   startTime = LocalTime.of(18, 00, 00);
//        LocalTime endTime = LocalTime.of(3, 00, 00);
//        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 2, 01, 00);
//
//        VerifyTime time1 = new VerifyTime();
//        Assertions.assertEquals(true, time1.isIntraday(startTime, endTime, date));
//    }
//    @Test
//    void isIntraday_SOD_SameDay_EOD_InPast_BeforeSOD4 () {
//        LocalTime   startTime = LocalTime.of(18, 00, 00);
//        LocalTime endTime = LocalTime.of(3, 00, 00);
//        LocalDateTime date = LocalDateTime.of(2018, Month.OCTOBER, 1, 4, 01, 00);
//
//        VerifyTime time1 = new VerifyTime();
//        Assertions.assertEquals(false, time1.isIntraday(startTime, endTime, date));
//    }
//
//
//
//        }