package ExceptionHandEx;

import java.io.*;
class Marolix extends Exception {
	Marolix(String name){
		super(name);
		//System.out.println("constructor");
	}
}
class BankAc {
	String name="Ganesh";
	int accountNo=12345678;
	int amount=200000;
    int withdraw,total;
	void stateBank() throws IOException {
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" State Bank Details ");
		System.out.println("your name is :"+name);
		System.out.println("your a/c no :"+accountNo);
		System.out.println("your amount :"+amount);
		//System.out.println("hello");
		try {
//			int a=10,b=0;
//			System.out.println(a/b);
			if (amount<=withdraw) {
				System.out.println("successfully completed");
			}else {
				throw new Marolix("insufficient bal");
			}
		} catch (Marolix e) {
			System.out.println(e);
		}
	}
}

public class ExceptionHandEx5 {

	public static void main(String[] args) throws IOException  {
	/*	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("write anything");
		String n=obj.readLine();
		System.out.println(n);*/
		BankAc ob=new BankAc();
		ob.stateBank();
       
	}

}
