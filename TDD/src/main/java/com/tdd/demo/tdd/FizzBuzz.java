package com.tdd.demo.tdd;

import org.springframework.stereotype.Component;

@Component
public class FizzBuzz {

	public String play(int i) {
		if(i%3==0) {
			return "Fizz";
		}
		return String.valueOf(i);
		// TODO Auto-generated method stub
	}

}
