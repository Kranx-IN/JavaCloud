package com.capgemini.service;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CalcyImplTest {
	@Test
	@Ignore
	public void testAdd() {
		fail("Not yet implemented");
		
	}
	
	@Test
	public void testAddForPositiveCase1(){
		CalcyImpl target = new CalcyImpl();
		long result = target.add();
		assertEquals(0, result);
	}
	
	@Test
	public void testAddForPositiveCase2(){
		CalcyImpl target = new CalcyImpl();
		long result = target.add(1,2,3,4);
		assertEquals(10, result);
		assertEquals(10, target.add(4,3,2,1));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAddShouldThrowIllegalArgumentException(){
		CalcyImpl target = new CalcyImpl();
		target.add(1,2,3,4,-5);	
	}

}
