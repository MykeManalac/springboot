package com.myke.springboot.test1.springboot_test1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class SpringbootTest1ApplicationTests {
	
	private Calculator calculatorUnderTest = new Calculator();

	@Test
	void shouldAddTwoNumbers() {
		//given
		int a = 15;
		int b = 5;
		int expected = 20;
		
		//when
		int result = calculatorUnderTest.addNumbers(a, b);
		
		//then
		assertEquals(expected, result);
	}
	
	class Calculator{
		int addNumbers(int a, int b) {
			return a + b;
		}
	}

}
