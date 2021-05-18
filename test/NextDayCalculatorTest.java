import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class NextDayCalculatorTest {
    NextDayCalculator nextDayCalculator = new NextDayCalculator();

    @Test
    void testCalculatorNextDay1() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";

        String result = nextDayCalculator.calculatorNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculatorNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";

        String result = nextDayCalculator.calculatorNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculatorNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";

        String result = nextDayCalculator.calculatorNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculatorNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "29/2/2018";

        String result = nextDayCalculator.calculatorNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculatorNextDay5() {
        int day = 28;
        int month = 2;
        int year = 2020;
        String expected = "29/2/2018";

        String result = nextDayCalculator.calculatorNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void testCalculatorNextDay6() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";

        String result = nextDayCalculator.calculatorNextDay(day, month, year);
        assertEquals(expected, result);
    }


    @Test
    void testCalculatorNextDay7() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";

        String result = nextDayCalculator.calculatorNextDay(day, month, year);
        assertEquals(expected, result);
    }


}