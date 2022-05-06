package com.pack1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number and print the Reverse number");
		int number;
		int reverse=0;
		number=sc.nextInt();
		while(number!=0) {
			
		int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
		}
        System.out.println("reverse number :"+reverse);
	}

}
