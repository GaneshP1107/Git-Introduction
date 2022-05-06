package Package1;

import java.util.Scanner;

class Matrix{
	int i,j;
	int n[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	void method() {
		System.out.println("lower traiangle");
		for ( i = 0; i <3 ; i++) {
			for ( j = 0; j < 3; j++) {
			  n[i][j]=sc.nextInt();
			}
		} 
	 }
	public void method1() {
		System.out.println("lowyer matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i<=j) {
					System.out.print(" "+n[i][j]);
				}else {
					n[i][j]=0;
					System.out.print(" "+n[i][j]);
				}
				
			}System.out.println();
		}
	}
}
 
public class LoweTraingle {

	public static void main(String[] args) {
		Matrix as=new Matrix();
		as.method();
		as.method1();
	}

}
/* 1 2 3
 * 4 5 6
 * 7 8 9*/
