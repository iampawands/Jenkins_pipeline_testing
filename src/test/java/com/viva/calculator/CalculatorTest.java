package com.viva.calculator;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	@Test
	public void sumTest() {
		Calculator calc = new Calculator();
		Assert.assertEquals(10, calc.sum(5, 5));
	}
	
	@Test
	public void subTest() {
		Calculator calc = new Calculator();
		Assert.assertEquals(0, calc.subtract(5, 5));
	}
	
	@Test
	public void mulTest() {
		Calculator calc = new Calculator();
		Assert.assertEquals(25, calc.multiply(5, 5));
	}
	
	@Test
	public void divTest() {
		Calculator calc = new Calculator();
		Assert.assertEquals(1, calc.divide(5, 5));
	}
	
}
