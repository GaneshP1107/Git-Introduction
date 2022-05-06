package com.pack1;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number to print the odd numbers");
		Scanner sc=new Scanner(System.in);
		int i=1,n;
		n=sc.nextInt();
		while(i<=n) {
			
			System.out.println(i);
			i=i+2;
			
		}
        i++;
	}

}
