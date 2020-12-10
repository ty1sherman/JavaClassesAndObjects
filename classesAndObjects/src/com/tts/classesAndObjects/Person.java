package com.tts.classesAndObjects;
import java.util.Scanner;
/*This application does the following:
 * Minimum 3 private instance variables
	An empty constructor
	A constructor that uses only 2 of your 3 variables
	A constructor that uses all 3 of your instance variables
	Get methods for all 3 of your instance variables
	Set methods for all 3 of your instance variables
	A method that returns a Boolean
	A method that returns a String
 * @Author Nelson T. Sherman
 * Date 12/9/2020
 */

public class Person {
	//VARIABLES
	private String name;
	
	private int age;
	
	private String location;
	
	//CONSTRUCTORS
	Person()
	{
		
	}
	
	Person(String name, int age)
	{
		this.name= name;
		this.age = age;
	}
	
	Person(String name, int age, String location)
	{
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	//METHODS
	public static String greeting(String x) //
	{
		
		return x;
	}
	
	public static boolean oldMan(int age)
	{
		if (age > 50){
			return true;
		}
		else
			return false;
	}
	
	//GETTERS & SETTERS
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getLocation() {
				return location;
			}

			public void setLocation(String location) {
				this.location = location;
			}
	
/* ************************** MAIN ********************** */	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Hello " +greeting("Tywon"));
		
		System.out.println("Enter your age: ");
		int age= sc.nextInt();
		
		System.out.println("His age more than 50? " +oldMan(age));
	}
	

}
