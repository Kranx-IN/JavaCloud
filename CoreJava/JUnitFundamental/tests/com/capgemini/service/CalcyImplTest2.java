package com.capgemini.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalcyImplTest2 {
	CalcyImpl target = null;
	
	@Before
	public void setup() {
		target = new CalcyImpl();
	}
	@After
	public void tearDown() {
		target = null;
	}
	@Test
	public void testAddForPositiveCase1(){
		long result = target.add();
		assertEquals(0, result);
	}	
	@Test
	public void testAddForPositiveCase2(){
		long result = target.add(1,2,3,4);
		assertEquals(10, result);
		assertEquals(10, target.add(4,3,2,1));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testAddShouldThrowIllegalArgumentException(){
		target.add(1,2,3,4,-5);	
	}
}