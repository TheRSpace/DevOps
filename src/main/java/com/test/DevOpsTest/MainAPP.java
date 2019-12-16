package com.test.DevOpsTest;

import java.io.IOException;

import com.test.DevOpsTest.propertiesEdit.PropertyManager;

public class MainAPP {
	public static void main(String[] args) throws IOException {
		Engine BaseEngine = Engine.getInstance();
		//dd-MM-yyyy HH:mm
		Pet DogTemp = new Pet(BaseEngine.dateParseToDate("09-11-2017 14:30"));
		Pet Moris = new Pet("Cat", "Moris");
		DogTemp.checkAge();
		System.out.println(DogTemp.getBornDate());
		System.out.println(Moris.getBornDate());
		PropertyManager properties = new PropertyManager();
		properties.getPropValues();
		properties.setPropertieValues("User", "MAster");
		properties.setPropertieValues("company1", "Amazon");
		properties.setPropertieValues("company2", "Google");
		properties.setPropertieValues("company3", "Youtube");
		properties.closeStream();
	}
}
