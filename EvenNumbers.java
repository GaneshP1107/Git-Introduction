package com.pack1;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number to print the Even number ");
		Scanner sc=new Scanner(System.in);
		int i=1,n;
		n=sc.nextInt();
		while(i<=n) {
			i=i+1;
			System.out.println(i);
			i++;
		}

	}

}
