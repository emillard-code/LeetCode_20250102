package com.project;

import org.junit.jupiter.api.*;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testMain() {

        assertTrue(true);

    }

    @Test
    public void testHelloWorld() throws Exception {

        String text = tapSystemOut(() -> Main.main(new String[]{}));

        assertEquals("Hello World!", text.trim());

    }

}
