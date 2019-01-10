package com.example

import com.kms.katalon.core.annotation.Keyword

class Calculator {

	@Keyword
	static double add(double a, double b) {
		return a + b;
	}

	@Keyword
	static double subtract(double a, double b) {
		return a - b;
	}

	@Keyword
	static double multiply(double x, double y) {
		return x * y
	}

	@Keyword
	static double divide(double x, double y) {
		return x / y
	}

	@Keyword
	static double power(double a, double b){
		int answer =a;
		for (int x = 2; x <= b; x++){
			answer *= a;
		}
		return answer;
	}
}
