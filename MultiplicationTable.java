package com.pack1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int i,n;
		n=sc.nextInt();
		System.out.println("multiplication table");
		for ( i = 1; i <= 10; i++) {
			System.out.println(n+"*"+i+"="+n*i);
			
		}

	}

}
