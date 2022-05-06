package com.pack1;

import java.util.Scanner;

public class Multiplication_Table_Ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Multiplication Table");
		n=sc.nextInt();
		for (int i = 1; i <=10 ; i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}
        
	}

}
