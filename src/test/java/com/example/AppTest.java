package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testStandardStringReversal() {
        App app = new App();
        assertEquals("olleh", app.reverseString("hello"));
        assertEquals("nasaravoop", app.reverseString("poovarasan"));
    }

    @Test
    public void testEmptyAndNullString() {
        App app = new App();
        assertEquals("", app.reverseString(""));
        assertNull(app.reverseString(null));
    }
}
