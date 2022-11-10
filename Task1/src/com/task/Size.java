package com.task;

import java.util.Scanner;

public class Size implements Isize{
public	 static int  amount;
public	static String  sizee = "";

	
public void classicsize() {
	int classicamt = 0;
	String size = "";
	
	System.out.println("\nWhich Size Of Piza You Want\n"+"1.Regular\n"+"2.Medium\n"+"3.Large\n");
	Scanner sc = new Scanner(System.in);
	int choice =sc.nextInt();
	if(choice == 1) {
		size = "Regular"; 
		classicamt = 135;
	}
	else if(choice == 2) {
		size = "Medium";
		classicamt=210;
	}
	else if(choice == 3) {
		size = "Large";
		classicamt=360;
	}
	sizee = size;
	amount = classicamt;
    
}


public void PremiumSize() {
	int primiumamt = 0;
	String size = "";
	System.out.println("Which Size Of Piza You Want\n"+"1.Regular\n"+"2.Medium\n"+"3.Large\n");
	Scanner sc = new Scanner(System.in);
	int choice =sc.nextInt();
	if(choice == 1) {
		size ="Regular";
		primiumamt = 165;
	}
	else if(choice == 2) {
		size ="Medium";
		primiumamt = 240;
	}
	else if(choice == 3) {
		size = "Large";
		primiumamt = 395;
	}	
	sizee = size;
	amount = primiumamt;
}
public void supremeSize() {
	int supremeamt = 0;
	String size = "";
	
	System.out.println("Which Size Of Piza You Want\n"+"1.Regular\n"+"2.Medium\n"+"3.Large\n");
	Scanner sc = new Scanner(System.in);
	int choice =sc.nextInt();
	if(choice == 1) {
		size ="Regular";
		supremeamt=190;
	}
	else if(choice == 2) {
		size ="Medium";
		supremeamt=290;
	}
	else if(choice == 3) {
		size ="Large";
		supremeamt=425;
	}
	sizee = size;
	amount=supremeamt;
}

}
