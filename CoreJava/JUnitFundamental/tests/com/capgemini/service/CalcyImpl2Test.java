package com.capgemini.service;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CalcyImpl2Test {

	@Test
	@Ignore
	public void testSub() {
		fail("Not yet implemented");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubForNegativeArguments1() {
		CalcyImpl2 target = new CalcyImpl2();
		target.sub(44, -9);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubForNegativeArguments2() {
		CalcyImpl2 target = new CalcyImpl2();
		target.sub(-44, 9);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSubForNegativeArguments3() {
		CalcyImpl2 target = new CalcyImpl2();
		target.sub(-44, -9);
	}
	
	@Test
	public void testSubForPositiveCase1() {
		CalcyImpl2 target = new CalcyImpl2();
		assertEquals(1, target.sub(5, 4));
	}
}
