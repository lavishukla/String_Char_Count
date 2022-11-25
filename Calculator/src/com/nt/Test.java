package com.nt;

public class Test {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		int add = calc.add(10, 20);
		System.out.println("Addition is :"+add);

		int sub = calc.subtraction(40, 15);
		System.out.println("Subttraction is :"+sub);
		
		int multiply = calc.multiply(5, 10);
		System.out.println("Multiplication is :"+multiply);
	
		int div = calc.division(60, 10);
		System.out.println("Divisison is :"+div);
	}

}
