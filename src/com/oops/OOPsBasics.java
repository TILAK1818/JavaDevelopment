package com.oops;

public class OOPsBasics {
	public static void main(String[] args) {
		Cars car1=new Cars();
		car1.brand="BMW";
		car1.color="White";
		car1.maxSpeed=190;
		car1.noOfSeats=4;
		
		car1.greeting();
		Cars car2=new Cars("Ferrari","Red",300,2);
		car2.greeting();
		System.out.println(car2.brand);
		System.out.println(Cars.MADE_IN);
		// Access static variables/methods using Class name since they are not depended on any objects
		
	}
	

}
class Cars{
	String brand;
	String color;
	int maxSpeed;
	int noOfSeats;
	final static String MADE_IN="India";
	
	//creating Constructors
	public Cars(String brand, String color,int maxSpeed, int noOfSeats){
		this.brand=brand;
		this.color=color;
		this.maxSpeed=maxSpeed;
		this.noOfSeats=noOfSeats;
		
	}
	
	public Cars() {
	}

	void greeting() {
		System.out.println("Hi this car is of brand "+brand);
	}
}
