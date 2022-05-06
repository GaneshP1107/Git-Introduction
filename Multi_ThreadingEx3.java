package multi.pack;

import java.util.Scanner;

class Bank_Ac extends Thread{
	//int pin;
	
	 public void run() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter your name");
		 String name=sc.next();
		 System.out.println("Enter your pin");
		 int pin=sc.nextInt();
	     System.out.println("Enter your A/C no :");
	     int acNum=sc.nextInt();
	    
			try {
				 System.out.println("Print the nums using sleep method");
				 for (int i = 1; i <=5 ; i++) {
					 System.out.println(i);
				     
				     Thread.sleep(2000);
			}
				 System.out.println("your numbers is executed");
			}		 catch (InterruptedException e) {
				//e.printStackTrace();
				System.out.println(e);
			}
	 }
}
class Ac_details extends Thread{
	   public void run() {
		 
			try {
				System.out.println("print letters");
				  for (int i = 1; i <=5 ; i++) {
					  System.out.println((char)i);
				//Thread.sleep(2000);
				
			}
				  System.out.println("letters is printed");
			}	
			catch (Exception e) {
				System.out.println("Some problems occured");
			}
	}
}
public class Multi_ThreadingEx3 {

	public static void main(String[] args) {
		Bank_Ac obj=new Bank_Ac();
		obj.start();
		Ac_details obj1=new Ac_details();
		obj1.start();
	
	}

}
