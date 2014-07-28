package leapyears;

import junit.framework.TestCase;

import org.junit.Test;

import static leapyears.LeapYears.isLeapYear;


public class LeapYearsTest extends TestCase {

    public void testFour() throws Exception {
        assertTrue(isLeapYear(4));
    }

}