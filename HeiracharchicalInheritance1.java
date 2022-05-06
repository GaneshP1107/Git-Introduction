package Package1;

import java.util.Scanner;

class Employee1{
	String name;
	int id;
	Scanner sc=new Scanner(System.in);
	void readh() {
    	System.out.println("Enter your name :");
		name=sc.next();
		System.out.println("Enter your id :");
		id=sc.nextInt();
		
	}
	void Employee() {
		
		System.out.println("your name :"+name);
		System.out.println("your id :"+id);
	}
}
class EmployeeD extends Employee1{
	String DB;
	int ex;
    int age;
	void readD() {
		System.out.println("Enter your Experience");
		DB=sc.next();
		System.out.println("Enter your date of birth");
		ex=sc.nextInt();
		System.out.println("Enter your age");
		age=sc.nextInt();
		
		
	}
	void show() {
		System.out.println("Enter your Experience :"+DB);
		System.out.println("Enter your date of birth :"+ex);
		System.out.println("Enter your age :"+age);
		System.out.println("THANKQUE");
	}
	
}
class Workers extends Employee1{
	String comN;
	int w;
	
	void InWorkers() {
		System.out.println("your company name :");
		comN=sc.next();
		System.out.println("how many workers in your comopany");
		w=sc.nextInt();
	}
	void show1() {
		System.out.println("your company name :"+comN);
		System.out.println("how many workers in your comopany :"+w);
	}
}

public class HeiracharchicalInheritance1 {

	public static void main(String[] args) {
		System.out.println("main method");
		Workers rr=new Workers();
		EmployeeD rrr=new EmployeeD();
        rrr.readh();
        rr.InWorkers();
        rrr.readD();
        rrr.Employee();
        rr.show1();
        rrr.show();
	}

}
