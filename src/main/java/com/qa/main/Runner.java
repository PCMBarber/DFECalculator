package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		System.out.println(calc.calculate("-",5,2));
		System.out.println(calc.calculate("/",10,3));
	}
	
}
