
import org.example.LeapYear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LeapYearTest {


    @Test
    public void LeapYear_divisible_by_4_but_not_by_100() {
        // 2004, 2012, 2020 is divisible by 4 but not by 100.
        // Therefore, assertTrue (isLeapYear should return True)

        assertTrue(LeapYear.isLeapYear(2004));
        assertTrue(LeapYear.isLeapYear(2012));
        assertTrue(LeapYear.isLeapYear(2020));
    }

    @Test
    public void LeapYear_divisible_by_400() {
        // Tried a different way of testing multiple years 🙂
        // Less asserts = good?

        Integer[] years = {1600, 2000, 2400};

        // 1600, 2000, 2400 is divisible by 400.
        // Therefore, assertTrue (isLeapYear should return True)
        for (int year : years) {
            assertTrue(LeapYear.isLeapYear(year));
        }
    }



    @Test
    public void NotLeapYear_not_divisible_by_4() {
        // 2003 (2011, 2019) isnot* divisible by 4.
        // Therefore, assertFalse (isLeapYear should return False)

        // Is there any need to test more than one year anyway? (with the same characteristics)
        assertFalse(LeapYear.isLeapYear(2003));
    }

    @Test
    public void NotLeapYear_divisible_by_100_not_divisible_by_400() {
        // 1700 (1800, 1900, 2100) is divisible by 100, but not 400.
        // Therefore, assertFalse (isLeapYear should return False)
        assertFalse(LeapYear.isLeapYear(1700));

    }
}




/*
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.example.IsLeapYear;

public class test_isLeapYear {

    @Test
    public void test_isLeapYear(){
        assertTrue(IsLeapYear.isLeapYear(2000)); // Test med et årstall for ett skuddår
    }

    @Test
    public void test_isNotLeapYear(){
        assertFalse(IsLeapYear.isLeapYear(2001)); //Test med et årstall for et år som ikke er skuddår
    }
    @Test
    public void twoYearsAfterLeapYear(){
        assertFalse(IsLeapYear.isLeapYear(2002)); //Test med et årstall for et år som ikke er skuddår
    }

    @Test
    public void ThreeYearsAfterLeapYear(){
        assertFalse(IsLeapYear.isLeapYear(2003)); //Test med et årstall for et år som ikke er skuddår
    }

    @Test
    public void FourYearsAfterLeapYear(){
        assertTrue(IsLeapYear.isLeapYear(2004)); //Test med et årstall for et år som ikke er skuddår
    }


    @Test
    public void FalseIfDevidableByBothFourAndHoundred(){
        assertFalse(IsLeapYear.isLeapYear(1700)); //Test med et årstall for et år som ikke er skuddår
    }
    @Test
    public void FalseIfDevidableByBothFourAndHoundred2(){
        assertFalse(IsLeapYear.isLeapYear(1800)); //Test med et årstall for et år som ikke er skuddår
    }
    @Test
    public void FalseIfDevidableByBothFourAndHoundred3(){
        assertFalse(IsLeapYear.isLeapYear(2100)); //Test med et årstall for et år som ikke er skuddår
    }

}*/
