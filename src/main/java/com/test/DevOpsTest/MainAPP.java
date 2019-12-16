package com.test.DevOpsTest;

public class MainAPP {
	public static void main(String[] args) {
		Engine BaseEngine = Engine.getInstance();
		//dd-MM-yyyy HH:mm
		Pet DogTemp = new Pet(BaseEngine.dateParseToDate("09-11-2017 14:30"));
		Pet Moris = new Pet("Cat", "Moris");
		DogTemp.checkAge();
		System.out.println(DogTemp.getBornDate());
		System.out.println(Moris.getBornDate());
		
	}
}
