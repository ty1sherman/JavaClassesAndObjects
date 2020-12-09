package com.tts.classesAndObjects;

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
		
	}
	
	Person(String name, int age, String location)
	{
		
	}
	
	//METHODS
	public static String greeting(String x) //
	{
		
		return x;
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
		
		
		
		System.out.println(greeting("Tywon"));
		
	}
	

}
