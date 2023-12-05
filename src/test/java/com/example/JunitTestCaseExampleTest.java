package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTestCaseExampleTest {

	@Test
    	public void testAdd() {
        	JunitTestCaseExample example = new JunitTestCaseExample();
        	assertEquals(4, example.add(2, 2));
    	}

	@Test
    	public void testSubtract() {
        	JunitTestCaseExample example = new JunitTestCaseExample();
        	assertEquals(3, example.subtract(5, 2));
    	}

	@Test
    	public void testMultiply() {
        	JunitTestCaseExample example = new JunitTestCaseExample();
        	assertEquals(10, example.multiply(5, 2));
    	}

	@Test
    	public void testAdd_x() {
        	JunitTestCaseExample example = new JunitTestCaseExample();
        	assertEquals(8, example.add(5, 2));
    	}
	
	@Test
    	public void testAdd_x2() {
        	JunitTestCaseExample example = new JunitTestCaseExample();
        	assertEquals(9, example.add(5, 2));
    	}
}
