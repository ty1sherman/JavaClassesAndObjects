package com.tts.classesAndObjects;
import java.util.Scanner;
import java.util.*;

/*This application creates a java calculator that takes 5 commands
 * add, subtraction, multiplication, division, and square (methods)
 * finally create a MagicCalculator that inherits is basic functionality 
 * from your calculator and does the following functions:
 * 	finds the square root of a number
 * 	finds the sin(trigonometry) of a number
 *	finds the cosine (trigonometry) of a number
 * 	finds the tangent (trigonometry) of a number
 * 	finds the factorial (!)of the number
 * @Author: Nelson T. Sherman
 * Date: 12/11/2020
 * */
public class calculator {

		//Methods for basic Math 
		public static int addition(int num1, int num2)
		{
			int addAnswer = 0;	
					addAnswer = num1 + num2;
					
			return addAnswer;
		}
		
		public static int subtraction(int num1, int num2)
		{
			int subAnswer = 0;
				subAnswer = num1 - num2;
			
			return subAnswer;
		}
		
		public static int multiplication(int num1, int num2) 
		{
			int multAnswer = 0;
				multAnswer = num1 * num2;
				
			return multAnswer;	
		}
		
		public static int division(int num1, int num2)
		{
			int divAnswer = 0;
				divAnswer = num1 / num2;
				
			return divAnswer;
		}
		
		public static double square(double num)
		{
			double squareAnswer = 0;
				squareAnswer =(double) Math.pow(num, 2);
						
			return squareAnswer;
		}
		
public static class magicCalculator extends calculator
{
	public static double sin(double num)
	{
		//convert degrees to radians
		double radians = Math.toRadians(num);
		
		//Sin() method to get sine value
		double sinValue = Math.sin(radians);
		
		return sinValue;
	}
	public static double cos(double num)
	{
		//convert degrees to radians
		double radians = Math.toRadians(num);
		
		//cos() method to get cosine value
		double cosValue = Math.cos(radians);
		
		return cosValue;
	}
	public static double tan(double num)
	{
		//convert degrees to radians
		double radians = Math.toRadians(num);
		
		//tan() method to get tangent value
		double tanValue = Math.tan(radians);
		
		return tanValue;
	}
	public static double fact(double num)
	{
		long factorial = 1;
		
		for(double i = 1; i< num; ++i)
		{
			//factorial = factorial * i
			factorial *= i;
		}
		
		return factorial;
	}
}		
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num; 
		int num1, num2;
		
		System.out.println("Let's do some basic math!");
		System.out.println("Enter a Number: ");
			num1= sc.nextInt();
		
		System.out.println("Enter the second Number");
		num2= sc.nextInt();
		System.out.println("The result of " +num1 +" + " +num2 + " is "+addition(num1, num2) +".");
		System.out.println("The result of " +num1 +" - " +num2 + " is "+subtraction(num1, num2)  +".");
		System.out.println("The result of " +num1 +" * " +num2 + " is "+multiplication(num1, num2)  +".");
		System.out.println("The result of " +num1 +" / " +num2 + " is "+division(num1, num2)  +"." +"\n");
		
		System.out.println("That was fun, now let's do some Trigonometry!");
		System.out.println("Enter a number from 1 to 50");
			num = sc.nextDouble();
		
		System.out.println("The square of " + num +" is " +square(num)+".");	
		System.out.println("The sine of " +num + " is "+magicCalculator.sin(num)  +".");
		System.out.println("The cosine of " +num + " is "+magicCalculator.cos(num)  +".");
		System.out.println("The tangent of " +num + " is "+magicCalculator.tan(num)  +".");
		System.out.println("The factorial of " +num + " is "+magicCalculator.fact(num)  +".");
	}

}
