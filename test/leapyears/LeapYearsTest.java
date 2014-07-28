package leapyears;

import junit.framework.TestCase;

import static leapyears.LeapYears.isLeapYear;


public class LeapYearsTest extends TestCase {

    public void testFour() throws Exception {
        assertTrue("Leap year must be divisible by 4", isLeapYear(4));
    }

    public void testHundred() throws Exception {
        assertFalse("Leap year must be divisible by 4 but not by 100", isLeapYear(100));
    }

    public void testFourHundred() throws Exception {
        assertTrue("Leap year must be divisible by 4 but not by 100 unless is divisible by 400",
                isLeapYear(1600));
    }

}