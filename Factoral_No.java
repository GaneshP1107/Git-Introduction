package com.pack1;

import java.util.Scanner;

public class Factoral_No {

	public static void main(String[] args) {
		System.out.println("Enter the factorial number");
		Scanner sc=new Scanner(System.in);
		int i=0,fact=1;
		int number=5;//factorial number
		//n=sc.nextInt();
		for ( i = 1; i <=number ; i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial of "+i+"  is :"+fact);
	}

}
