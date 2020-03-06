package com.capgemini.service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCasesDemo {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	@Before
	public void setup() {
		System.out.println("Setup");
	}
	@After
	public void tearDown() {
		System.out.println("Teardown");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	@Test
	public void testCase1() {
		System.out.println("Test case 1");
	}
	@Test
	public void testCase2() {
		System.out.println("Test case 2");
	}
}
