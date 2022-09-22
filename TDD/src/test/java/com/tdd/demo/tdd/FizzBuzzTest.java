package com.tdd.demo.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	private FizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testNumber() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		String returnedNumber = fizzBuzz.play(1);
		assertEquals("1",returnedNumber);
	}

}
