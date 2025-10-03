package com.oops.inheritence;

public class Shapes {

	public static void main(String[] args) {
		Box box1=new Box();
		box1.information();
		Box box2=new Box(2);
		box2.information();
		Box box3=new Box(4,2,4);
		box3.information();
		// passing an object itself
		Box box4=new Box(box2);
		box4.information();
		
		BoxWeight box5=new BoxWeight();
		box5.information();
		
		// in order to pass the values for the parent class constructor through child class object.
		//create a constructor with super keyword in the child class.
		
		BoxWeight box6=new BoxWeight(2,3,4,4);
		System.out.println(box6.weight);
		box6.information();
		
		Box box7=new BoxWeight();
		//This is not possible because the type of reference variable  determines what members can access
		//In this case since the reference variable is of type Box it cannot access members of BoxWeight
		//box7.weight;
		box7.h=3;
		box7.information();

	}

}
