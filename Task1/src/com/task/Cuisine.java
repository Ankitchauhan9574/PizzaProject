package com.task;

import java.util.Scanner;

public class Cuisine implements Icuisine {
public void selectcuisine() {
	Rgscatagory abc = new Rgscatagory();
	
	
	
	System.out.println("Welcom to Pizza Shop");
	System.out.println("Select Cuisine");
	System.out.println(" 1.Regular");
	System.out.println(" 2.Jain");
	System.out.println(" 3.Non-Veg");
	
	Scanner sc= new Scanner(System.in);
	int choice = sc.nextInt();
	
	if(choice == 1) {
		abc.regularpizza();
	}
	else if(choice == 2) {
		abc.jain();
	}
	else if(choice == 3) {
		abc.nonveg();
	}
	else {
		System.out.println("decide only one out of 3 catagory");
	}
	
   }
}
