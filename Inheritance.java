package Package1;

import java.util.Scanner;

public class Inheritance {
	int id;
	String name;
	
	Scanner sc=new Scanner(System.in);
	void read(int a,int b) {
		System.out.println("This instace method");
		System.out.println("enter your id");
		id=sc.nextInt();
		System.out.println("enter your name :");
		name=sc.next();
	}
	void show() {
		System.out.println("your id is "+id);
		System.out.println("your name is :"+name);
	}

	public static void main(String[] args) {
     System.out.println("this is main method");
     Inheritance obj=new Inheritance();

     obj.read(10, 20);
     obj.show();

	}

}
