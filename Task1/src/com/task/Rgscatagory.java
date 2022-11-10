package com.task;

import java.util.Scanner;

class Rgscatagory{
	
	Catagories cc = new Catagories();
		
	public void regularpizza() {
		System.out.println("We Have 3 Catagories In Regular Pizza Please Choose Any One");
		System.out.println("1.Classic\n"+"2.Premium\n"+"3.Supreme\n");
		
		Scanner sc2 = new Scanner(System.in);
		int choice2 = sc2.nextInt();
		
		if(choice2 == 1) {
			//System.out.println("You Selected Classic");
			cc.classic();
			
		}
		else if(choice2 == 2) {
			//System.out.println("You Selected Premium");
			cc.Premium();
		}
		else if(choice2 == 3) {
			//System.out.println("You Selected Supreme");
			cc.supreme();
		}
		else {
			System.out.println("decide only one out of 3 catagory");
		}
	
	}
	
	public void jain(){
		System.out.println("We Have 3 Catagories In Jain Pizza Please Choose Any One");
		System.out.println("1.Classic\n"+"2.Premium\n"+"3.Supreme\n");
		
		Scanner sc3 = new Scanner(System.in);
		int choice2 = sc3.nextInt();
		
		if(choice2 == 1) {
			cc.classic();
		}
		else if(choice2 == 2) {
			cc.Premium();
		}
		else if(choice2 == 3) {
			cc.supreme();
		}
		else {
			System.out.println("decide only one out of 3 catagory");
		}
	
	}

	public void nonveg() {
		System.out.println("We Have 3 Catagories In Regular Non-Veg Please Choose Any One");
		System.out.println("1.Classic\n"+"2.Premium\n"+"3.Supreme\n");
		
		Scanner sc4 = new Scanner(System.in);
		int choice2 = sc4.nextInt();
		
		if(choice2 == 1) {
			cc.classic();
		}
		else if(choice2 == 2) {
			cc.Premium();
		}
		else if(choice2 == 3) {
			cc.supreme();
		}
		else {
			System.out.println("decide only one out of 3 catagory");
		}
	
	}
}
