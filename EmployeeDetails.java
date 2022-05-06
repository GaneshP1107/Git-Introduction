package Package1;

import java.util.Scanner;

class Employee{
	String name;
	int id;
	//int password=143;
	//int userpin;
	void Emread() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee details");
		System.out.println("Enter the name :");
		name=sc.next();
		System.out.println("Employee id");
		id=sc.nextInt();
	
}
	void EmshowP() {
		//System.out.println("Employee name,id");
		System.out.println("Employee name :"+name);
		System.out.println("Employee id :"+id);
	}
}
class PersonalDe extends Employee{
	String DB;
	String mail;
	float sal;
	int phonenum;

void EmreadPS() {
	Scanner sc=new Scanner(System.in);
	//System.out.println("Personal Details");

	System.out.println("date of birth");
	DB=sc.next();
	System.out.println("Enter your Email");
	mail=sc.next();
	System.out.println("Enter your salary");
	sal=sc.nextFloat();
	System.out.println("Enter your mobile No :");
	phonenum=sc.nextInt();
	
}
void Emprint() {
	System.out.println("your date of birth :"+DB);
	System.out.println("Your mail id :"+mail);
	System.out.println("Enter your mobile no :"+phonenum);
}
void Employeee() {
	System.out.println("enter your pin");
	Scanner sc=new Scanner(System.in);
	//if(userpin==password) {
		//userpin=sc.nextInt();
		//System.out.println("your in is right");
	//}else {
		//System.out.println("your pin is wrong");
	//}
}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		System.out.println("Main method");
		PersonalDe p=new PersonalDe();
		p.Emread();
		p.EmreadPS();
		p.EmshowP();
		p.Emprint();
		p.Employeee();
	}

}
