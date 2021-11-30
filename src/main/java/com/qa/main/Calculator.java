package com.qa.main;

public class Calculator {
	
	private double addition(double a, double b) {
		return a+b;
	}
	
	private double subtraction(double a, double b) {
		return a-b;
	}
	
	private double multiplication(double a, double b) {
		return a*b;
	}
	
	private double division(double a, double b) {
		return a/b;
	}
	
	public double calculate(String operator, double a, double b) {
		switch(operator) {
		case "-":
			return subtraction(a,b);
		case "+":
			return addition(a,b);
		case "*":
			return multiplication(a,b);
		case "/":
			return division(a,b);
		default:
			System.out.println("Invalid operator");
			return 0;
		}
	}
}
