package Package1;

import java.util.Scanner;

class LowerTr{
	int i,j;
	int n[][]=new int [3][3];
	Scanner sc=new Scanner (System.in);
	void lower() {
		System.out.println("lower triangle input values");
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < n.length; j++) {
				n[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("lower triangle");
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < 3; j++) {
				if (i>=j) {
					System.out.print(" "+n[i][j]);
				}else {
					n[i][j]=0;
					System.out.print(" "+n[i][j]);
				}
			}
			System.out.println();
		}
	}
}

public class LowerTrEx {

	public static void main(String[] args) {
		LowerTr ob=new LowerTr();
		ob.lower();
	}

}
