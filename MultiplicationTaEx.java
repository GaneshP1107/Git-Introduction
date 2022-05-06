package Package1;

import java.util.Scanner;

class Multiplication{
	int i,j;
	int x[][]=new int [3][3];
	int y[][]=new int [3][3];
	int z[][]=new int [3][3];
	Scanner sc=new Scanner(System.in);
	void getmethod() {
		System.out.println("INPUT 1");
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < 3; j++) {
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("INPUT 2");
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < 3; j++) {
				y[i][j]=sc.nextInt();
			}
		}
	}
		void readmethod() {
			System.out.println("OUTPUT");
			for ( i = 0; i < 3; i++) {
				for ( j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						z[i][j]+=x[i][k]*y[k][j];
					}
					System.out.print(" "+z[i][j]);
				}
				System.out.println();
			}
		
	}
}

public class MultiplicationTaEx {

	public static void main(String[] args) {
		Multiplication ob=new Multiplication();
		ob.getmethod();
		ob.readmethod();
	}

}
