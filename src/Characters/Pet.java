package Characters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import MainEngine.Engine;

public class Pet {
	
	Engine BaseEngine = Engine.getInstance();
	private String name;
	private PetType petType;
	private Date bornDate;
	private int happines = 10;
	private int age = 0;
	
	public Pet(Date date) {
		setPetType(PetType.Dog);
		setAge(0);
		setBornDate(date);
	}
	public Pet(String petType, String name) {
		setPetType(interpretType(petType));
		setName(name);
		setBornDate(new Date());
	}
	public PetType interpretType(String type) {
		if(type.contains("cat")||type.contains("Cat")) {
			return PetType.Cat;
		}else if(type.contains("dog")||type.contains("Dog")) {
			return petType.Dog;
		}else
			return petType.Monkey;
	}
	
	public void checkAge() {
		//int age = BaseEngine.age(getBornDate());
		//setAge(age);
		System.out.println(BaseEngine.age(getBornDate()));
	}
	
	private enum PetType {
		Dog, Cat, Monkey
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public int getHappines() {
		return happines;
	}

	public void setHappines(int happines) {
		this.happines = happines;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		String curentTime = dateFormat.format(bornDate);
		try {
			this.bornDate = dateFormat.parse(curentTime);
		} catch (ParseException e) {
			//System.out.println("Pet could not be born");
			e.printStackTrace();
		}
	}
	
	
}
