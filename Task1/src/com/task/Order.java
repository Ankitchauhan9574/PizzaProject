package com.task;

import java.util.Scanner;

public class Order {

	public void orderpizza() {
		Order or = new Order();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter 1 For Order Else Enter 0 For Cancel The Order");
		
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("Order Successfull");
		}
		else if(choice == 0) {
			System.out.println("Order Cancelled");
			
		}
		else {
			System.out.println("Please Enter Valid Input");
			or.orderpizza();
		}
	}
	
}
