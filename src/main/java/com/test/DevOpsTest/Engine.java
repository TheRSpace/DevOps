package com.test.DevOpsTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class Engine {
	private Date todaysDate = new Date();
	private ArrayList<Pet> pets = new ArrayList<Pet>();
	private static Engine instance = new Engine();
	
	public String age(Date bornDate) {
		int yearBorn = getDatesIntYear(bornDate);
		int monthBorn = getDatesIntMonth(bornDate);
		int dayBorn = getDatesIntDay(bornDate);
		
		int todaysYear = getDatesIntYear(todaysDate);
		int todaysMonth = getDatesIntMonth(todaysDate);
		int todaysDay = getDatesIntDay(todaysDate);
		
		if(todaysMonth == monthBorn && todaysYear > yearBorn && todaysDay == dayBorn) {
			System.out.println("It's your pets birth day");
		}
		int years = todaysYear - yearBorn;
		int months = todaysMonth - monthBorn;
		return "Your pet is " + years + " years and " + months + " months old";
		//else {
			//System.out.println("Your Pet has not reached a full year");
			//return  "Your pet was just born";
		//}
		
	}
	public static Engine getInstance() {
		return instance;
	}
	public Date dateParseToDate(String date) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		Date bornDateTime = new Date();
		//curentTime = dateFormat.format(curentDateTime);
		try{
		    bornDateTime = dateFormat.parse(date);
		} catch (ParseException e){ 
			System.out.println("invalid format");
		}
		return bornDateTime;
		
	}
	public String dateParseToString(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat.format(date);
	}
	public int getDatesIntYear(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		String yearString = dateFormat.format(date);
		return Integer.parseInt(yearString);
		
	}
	public int getDatesIntMonth(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("M");
		String monthString = dateFormat.format(date);
		return Integer.parseInt(monthString);
		
	}
	public int getDatesIntDay(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("d");
		String dayString = dateFormat.format(date);
		return Integer.parseInt(dayString);
		
	}

}
