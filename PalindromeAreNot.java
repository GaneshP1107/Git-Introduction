package com.pack1;

import java.util.Scanner;

public class PalindromeAreNot {

	public static void main(String[] args) {
		System.out.println("Enter a palindrome number");
		Scanner sc=new Scanner(System.in);
		int reverse=0,sum=0;
		int temp;
		int number=sc.nextInt();
		temp=number;
		while (number>0) {
			
			reverse=number%10;
			sum=(sum*10)+reverse;
			number=number/10;
		}
		
		if (temp==sum) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
