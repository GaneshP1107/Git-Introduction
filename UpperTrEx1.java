package Package1;

import java.util.Scanner;

class UpperTraiangle{
	int i,j;
	int n[][]=new int [3][3];
	Scanner sc=new Scanner(System.in);
	void venu1() {
		System.out.println("upper triangle");
		for (i = 0; i < 3; i++) {
			for ( j = 0; j < 3; j++) {
				n[i][j]=sc.nextInt();
				
			}
		}System.out.println("UPPER TRIANGLE");
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < 3; j++) {
		       if (i >= j) {
				System.out.print(" "+n[i][j]);
			}		else {
				n[i][j]=0;
				System.out.print(" "+n[i][j]);
			}
			}
			System.out.println();
		}
	}
}

public class UpperTrEx1 {

	public static void main(String[] args) {
		UpperTraiangle obj=new UpperTraiangle();
		obj.venu1();
	}

}
