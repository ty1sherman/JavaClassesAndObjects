package com.tts.classesAndObjects;

/*This project does the following: 
 * Create a Pet Class with the following instance Variables
 *name (PRIVATE)
  age (PRIVATE)
  location (PRIVATE)
  type (PRIVATE) 
  two constructors
  empty
  all attributes 		
 *@author Nelson T. Sherman
 *Date: 12/9/2020
 */
public class Pet {

	//Variables
	private String Name;
	
	private int Age;
	
	private String Location;
	
	private String Type;
	
	//Constructors
	private Pet() //Empty
	{
		
	}
	
	private Pet(String Name, int Age, String Location, String Type)//All attibutes
	{
		this.Name = Name;
		this.Age = Age;
		this.Location = Location;
		this.Type = Type;
	}
	
	/*Code to be able to access the following (Get Methods):
		name
		age
		type
	Code to be able to change (Set Methods):
		name
		age
		location
	  
	 */
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getType() {
		return Type;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}


}
