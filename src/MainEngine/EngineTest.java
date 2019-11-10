package MainEngine;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Characters.Pet;

class EngineTest {
	
	private Engine engine;
	private Pet PetTemp;
	//private Pet Moris;
	
	@BeforeEach
	void setUp() throws Exception {
		engine = Engine.getInstance();
		//dd-MM-yyyy HH:mm
		PetTemp = new Pet(engine.dateParseToDate("09-11-2017 14:30"));
		//Moris = new Pet("Cat", "Moris");
		
	}

	@Test
	void test() {
		int result = PetTemp.checkAge();
		assertEquals(2, result);
	}

}
