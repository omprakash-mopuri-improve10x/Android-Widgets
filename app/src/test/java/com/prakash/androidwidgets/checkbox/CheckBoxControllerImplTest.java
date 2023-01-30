package com.prakash.androidwidgets.checkbox;

import junit.framework.TestCase;

public class CheckBoxControllerImplTest extends TestCase {

    public void testCreateOrderDetails() {
        String expectedOutput = "Selected Items:\nCoffee Rs.50\nTotal Rs: 50";
        String actualOutput = new CheckBoxControllerImpl().createOrderDetails(false,
                true, false);
        assertEquals(expectedOutput, actualOutput);
    }
}