package com.tdd.demo.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	private FizzBuzz fizzBuzz;

	@BeforeEach
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testNumber() {
		String returnedNumber = fizzBuzz.play(2);
		assertEquals("2", returnedNumber);
	}

	@Test
	public void testFizz() {
		String returnedNumber = fizzBuzz.play(6);
		assertEquals("Fizz", returnedNumber);
	}

	@Test
	public void testBuzz() {
		String returnedNumber = fizzBuzz.play(5);
		assertEquals("Buzz", returnedNumber);
	}

	@Test
	public void testFizzBuzz() {
		String returnedNumber = fizzBuzz.play(15);
		assertEquals("FizzBuzz", returnedNumber);
	}

}
