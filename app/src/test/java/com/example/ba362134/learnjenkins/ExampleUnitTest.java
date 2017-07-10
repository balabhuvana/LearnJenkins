package com.example.ba362134.learnjenkins;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void useAdd() throws Exception {
        // Context of the app under test.
        assertEquals(100, 100);
    }

    @Test
    public void useSub() throws Exception {
        // Context of the app under test.
        assertEquals(150, 150);
    }

    @Test
    public void useMul() throws Exception {
        // Context of the app under test.
        assertEquals(250, 250);
    }

    @Test
    public void useDiv() throws Exception {
        // Context of the app under test.
        assertEquals(300, 300);
    }
}