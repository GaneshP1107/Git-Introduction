package multi.pack;

import java.util.Scanner;

public class SingleMul_thread {

	public static void main(String[] args) throws Exception {
		//single tasking_threading program
		System.out.println("SINGLE THREADING");
		System.out.println("Enter your A/c no :");
		Scanner sc=new Scanner(System.in);
		int accno=sc.nextInt();
		System.out.println("Enter your password :");
		String pass=sc.next();
		System.out.println("Print the numbers using sleep method");
		for (int i = 1; i <=5 ; i++) {
		
			Thread.sleep(3000);
			System.out.println(i);
			
		}
		System.out.println("your Num...");
//		for (int j = 1; j <=5 ; j++) {
//			System.out.println((char)j);
//			Thread.sleep(1000);
//			
//		}

	}

}
