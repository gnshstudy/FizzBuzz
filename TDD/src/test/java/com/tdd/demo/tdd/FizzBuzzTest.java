package com.tdd.demo.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	@Test
	public void testNumber() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		int returnedNumber = fizzBuzz.play(1);
		assertEquals(1, returnedNumber);
	}

}
