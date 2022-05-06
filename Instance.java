package Package1;

import java.util.Scanner;

class Parenth{
	int a,b,c;
	int method(int x,int y) {
		System.out.println("parameters");
		Scanner sc=new Scanner(System.in);
		a=x;
		b=y;
		c=x+y;
		c=sc.nextInt();
		
		return c;
	}
}

public class Instance {
	public static void main(String[] args) {
		//int c;
		System.out.println("This is main method");
		Parenth sc=new Parenth();
        sc.method(20,40);
	}

}
