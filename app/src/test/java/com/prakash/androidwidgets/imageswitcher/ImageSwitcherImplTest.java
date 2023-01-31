package com.prakash.androidwidgets.imageswitcher;

import junit.framework.TestCase;

public class ImageSwitcherImplTest extends TestCase {

    public void testGetNextImageIndex() {
        int expectedOutput = 0;
        int actualOutput = new ImageSwitcherImpl().getNextImageIndex(2,3);
        assertEquals(expectedOutput, actualOutput);
    }
}