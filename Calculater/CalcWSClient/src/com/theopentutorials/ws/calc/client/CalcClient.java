package com.theopentutorials.ws.calc.client;

import com.theopentutorials.ws.calc.Calculator;
import com.theopentutorials.ws.calc.CalculatorService;

public class CalcClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		CalculatorService calcService = new CalculatorService();
		Calculator calc = calcService.getCalculatorPort();
		System.out.println(a + " + " + b + " = " + calc.add(a, b));
		System.out.println(a + " - " + b + " = " + calc.sub(a, b));

	}

}
