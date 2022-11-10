package com.task;

import java.util.Scanner;

public class Ingrediants extends Size {
	Order order = new Order();
	
	public void tomchi() {
		Size size = new Size();
	String a =size.sizee;
		System.out.println("Which Ingrediants You wan to choose\n"+"1.Tomato\n"+"2.Onion\n"+"3.Chilly & Cheese\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of Ingrediants you want to Choose: ");
		String[] string = new String [sc.nextInt()];
		
        sc.nextLine(); 
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = sc.nextLine();  
		}
		
		
		size.classicsize();
		System.out.print("you have selected classic tomchi" +" "+ sizee +" With Ingrediants ");
		for(String str: string)   
		{  
		System.out.print(str+" ");  
		}
		System.out.print("Worth price "+ amount+"\n");
		order.orderpizza();
	}
	public void caponito() {
		Size size = new Size();
		String a =size.sizee;
		System.out.println("Which Ingrediants You wan to choose\n"+"1.Capsicum\n"+"2.Onion\n"+"3.Tomato & Cheese\n");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter the number of Ingrediants you want to Choose: ");
		String[] string = new String [sc.nextInt()];
		
        sc.nextLine(); 
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = sc.nextLine();  
		}
		size.classicsize();
		
		System.out.print("you have selected classic caponito" +" "+ sizee +" With Ingrediants ");
		for(String str: string)   
		{  
		System.out.print(str+" ");  
		}
		System.out.print("Worth price "+ amount);
		order.orderpizza();
	}
	public void RedIndian() {
		Size size = new Size();
		String a =size.sizee;
		System.out.println("Which Ingrediants You wan to choose");
		System.out.println("1.Cheese\n"+"2.Paneer\n"+"3.Chilly\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the number of Ingrediants you want to Choose: ");
		String[] string = new String [sc.nextInt()];
		
        sc.nextLine(); 
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = sc.nextLine();  
		}
		size.PremiumSize();
		
		System.out.print("you have selected Premium Red Indian" +" "+ sizee +" With Ingrediants ");
		for(String str: string)   
		{  
		System.out.print(str+" ");  
		}  
		System.out.print("Worth price "+ amount);
		order.orderpizza();
		
	}
	public void partyLovers() {
		Size size = new Size();
		String a =size.sizee;
		System.out.println("Which Ingrediants You wan to choose");
		System.out.println("1.Cheese\n"+"2.Sweetcorn\n"+"3.Capsicum\n"+"4.Tomato\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the number of Ingrediants you want to Choose: ");
		String[] string = new String [sc.nextInt()];
		
        sc.nextLine(); 
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = sc.nextLine();  
		}
		size.PremiumSize();
		
		System.out.print("you have selected Premium Party Lovers" +" "+ sizee +" With Ingrediants ");
		for(String str: string)   
		{  
		System.out.print(str+" ");  
		}  
		System.out.print("Worth price "+ amount);
		order.orderpizza();
	}
	public void americanHeat() {
		Size size = new Size();
		String a =size.sizee;
		System.out.println("Which Ingrediants You wan to choose");
		System.out.println("1.Cheese\n"+"2.Capsicum\n"+"3.Baby Corn\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of Ingrediants you want to Choose: ");
		String[] string = new String [sc.nextInt()];
		
        sc.nextLine(); 
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = sc.nextLine();  
		}

		size.supremeSize();
		
		System.out.print("you have selected Supreme American Heat" +" "+ sizee +" With Ingrediants ");
		for(String str: string)   
		{  
		System.out.print(str+" ");  
		} 
		System.out.print("Worth price "+ amount);
		order.orderpizza();
	}
	public void reUnion() {
		Size size = new Size();
		String a =size.sizee;
		System.out.println("Which Ingrediants You wan to choose");
		System.out.println("1.Cheese\n"+"2.Spanish\n"+"3.Capsicum\n"+"4.Baby Corn\n"+"5.Olives\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of Ingrediants you want to Choose: ");
		String[] string = new String [sc.nextInt()];
		
        sc.nextLine(); 
		for (int i = 0; i < string.length; i++)   
		{  
		string[i] = sc.nextLine();  
		}
		size.supremeSize();
		
		System.out.print("you have selected Supreme Re-Union" +" "+ sizee +" With Ingrediants ");
		for(String str: string)   
		{  
		System.out.print(str+" ");  
		}
		System.out.print("Worth price "+ amount);
		order.orderpizza();
	}
	
}