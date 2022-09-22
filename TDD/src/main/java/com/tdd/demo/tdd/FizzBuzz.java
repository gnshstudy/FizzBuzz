package com.tdd.demo.tdd;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzz {

	public String play(int i) throws Exception {
		String returnValue;
		try {

			if (i % 3 == 0 && i % 5 == 0) {
				returnValue = "FizzBuzz";
				return "FizzBuzz";
			} else if (i % 3 == 0) {
				returnValue = "Fizz";
				return "Fizz";
			} else if (i % 5 == 0) {
				returnValue = "Buzz";

			} else {
				returnValue = String.valueOf(i);
			}
		} catch (Exception e) {
			throw new Exception("Invalid Input Value");
		}
		// TODO Auto-generated method stub
		return returnValue;
	}

}
