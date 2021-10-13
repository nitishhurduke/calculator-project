package com.cjc.calculator.serviceImpl;

import java.util.Scanner;

import com.cjc.calculator.service.Calculator;

public class Operation implements Calculator {

	Scanner sc =new Scanner(System.in);
	
	@Override
	public void add() {
		System.out.println("  *ADDITION*");
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		System.out.print("Enter y : ");
		int y = sc.nextInt();
		System.out.println();
		System.out.println("Addition is: "+(x+y));
		System.out.println();
	}

	@Override
	public void sub() {
		System.out.println("  *SUBTRACTION*");
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		System.out.print("Enter y : ");
		int y = sc.nextInt();
		System.out.println();
		System.out.println("Subtration is: "+(x-y));
		System.out.println();
	}

	@Override
	public void mul() {
		System.out.println("  *MULTIPLICATION*");
		System.out.print("Enter x : ");
		int x = sc.nextInt();
		System.out.print("Enter y : ");
		int y = sc.nextInt();
		System.out.println();
		System.out.println("Multiplication is: "+(x*y));	
		System.out.println();
	}

	@Override
	public void div() {
		System.out.println("  *DIVISION*");
		System.out.print("Enter x : ");
		float x = sc.nextFloat();
		System.out.print("Enter y : ");
		float y = sc.nextFloat();
		System.out.println();
		System.out.println("Division is: "+(x/y));	
		System.out.println();
	}

}
