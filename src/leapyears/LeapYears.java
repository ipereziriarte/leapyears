package leapyears;

/**
 * Simple Calculate that the given year is a leap year. A Leap year is one that is divisible by 4
 * but not divisible by 100 unless it is also divisible by 400;
 */
public class LeapYears {

    public static boolean isLeapYear(int year) {

        return year % 4 == 0;

    }

}
