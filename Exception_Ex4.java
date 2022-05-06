package ExceptionHandEx;

import java.io.*;
import java.util.Scanner;

class Bank extends Exception{
	Bank(String name)
	{
	super(name);	
	}
	
}
class Axis {
	Scanner sc=new Scanner(System.in);
	int pass=143;
	int userpin ;
	int balance;
	float Amount=200000,tot;
	int accountno=123456,account;
	void AxisDetails() throws IOException {
		
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String s=obj.readLine();
		System.out.println("enter your pin ");
		userpin=sc.nextInt();
		System.out.println("Account number :");
		account=sc.nextInt();
		System.out.println("enter your amount");
		balance=sc.nextInt();
		
		if (userpin==pass) {
			System.out.println("your pin is right");
		}else {
			System.out.println("your pin is wrong");
		}if (accountno==account) {
			System.out.println("your acount no is right");
		}else {
			System.out.println("your a/c no wrong");
		}
		try {
			
			if (Amount>=balance) {
				tot=Amount-balance;
				System.out.println("Remaining balance "+tot);
				System.out.println("your cash is collected");
			}else {
				throw new Bank("your bank balance is insufficient");
			}
		} catch (Bank e) {
			System.out.println(e);
		}finally {
			System.out.println("YOUR TRANSECTION IS SUCCESSFULLY COMPLETED");
		}

	    
	}
}

public class Exception_Ex4 {

	public static void main(String[] args) throws IOException {
		Axis as=new Axis();
		as.AxisDetails();
	}

}
