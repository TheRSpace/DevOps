package com.test.DevOpsTest;


//import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for simple App.
 */

public class AppTest 
{
	private Pet PetTemp;
	private Engine engine;
	
	//private Pet Moris;
	
	@BeforeEach
	public void setUp() throws Exception {
		engine = Engine.getInstance();
		//dd-MM-yyyy HH:mm
		PetTemp = new Pet(engine.dateParseToDate("09-11-2017 14:30"));
		//Moris = new Pet("Cat", "Moris");
		
	}

	@Test
	public void test() {
		int result = PetTemp.checkAge();
		assertEquals(2, result);
	}

}
