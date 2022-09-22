package com.tdd.demo.tdd;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	private FizzBuzz fizzBuzz;

	@BeforeEach
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@DisplayName("Number is not divisible by both 3 and 5")
	@Test
	public void testNumber() throws Exception {
		String returnedNumber = fizzBuzz.play(2);
		assertEquals("2", returnedNumber);
	}

	@DisplayName("FizzNumber is not divisible by 3")
	@Test
	public void testFizz() throws Exception {
		String returnedNumber = fizzBuzz.play(6);
		assertEquals("Fizz", returnedNumber);
	}

	@DisplayName("Buzz-Number is not divisible by 5")
	@Test
	public void testBuzz() throws Exception {
		String returnedNumber = fizzBuzz.play(5);
		assertEquals("Buzz", returnedNumber);
	}

	@DisplayName("FizzBuzz-Number is not divisible by both 3 and 5")
	@Test
	public void testFizzBuzz() throws Exception {
		String returnedNumber = fizzBuzz.play(15);
		assertEquals("FizzBuzz", returnedNumber);
	}

	@DisplayName("Expecting Exception When input is null")
	@Test
	public void testIfNumberIsNull() throws Exception {
		assertThrows(Exception.class, () -> {
			fizzBuzz.play((Integer) null);
		});

	}

}
