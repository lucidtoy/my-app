package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTestCaseExampleTest {

    @Test
    public void testAdd() {
        JunitTestCaseExample example = new JunitTestCaseExample();
        assertEquals(4, example.add(2, 2));
    }
}
