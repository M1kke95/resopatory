package org.example;

public class IsLeapYear {

    public static boolean isLeapYear(int i) {
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            return true; // Skuddår
        } else {
            return false; // Ikke skuddår
        }
    }

}