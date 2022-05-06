package com.pack1;

import java.util.Scanner;

public class Odd_numbers_Ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ODD NUMBERS");
        int i=1,n;
        n=sc.nextInt();
       while (i<=n) {
		System.out.println(i);
		i+=2;
	}
       i++;
	}
}
