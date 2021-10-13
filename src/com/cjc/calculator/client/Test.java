package com.cjc.calculator.client;

import java.util.Scanner;
import com.cjc.calculator.service.Calculator;
import com.cjc.calculator.serviceImpl.Operation;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Calculator c = new Operation();
		while(true) {
			
			System.out.println("Choose from following Operation");
			System.out.println(" 1.Addition");
			System.out.println(" 2.Subtraction");
			System.out.println(" 3.Multiplication");
			System.out.println(" 4.Division");
			System.out.println(" 5.Exit");
			
			int input = sc.nextInt();
			
			switch(input)
			{
			case 1: 
				c.add();
				break;
			
			case 2:
				c.sub();
				break;
				
			case 3:
				c.mul();
				break;
			
			case 4:
				c.div();
				break;
			
			case 5:
					System.out.println("Thanks for using me...");
				System.exit(0);
			}		
		}
	}
}
