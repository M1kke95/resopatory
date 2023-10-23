package test;

import org.junit.Test;
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

}
