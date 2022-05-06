package Package1;

import java.util.Scanner;

class UpperTrai{
	int i,j;
	int n[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	void upper() {
		System.out.println("upper tariangle");
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < 3; j++) {
			  n[i][j]=sc.nextInt();	
			}
		}
	}
	void uppwe1() {
		for ( i = 0; i < 3; i++) {
			for ( j = 0; j < 3; j++) {
				if (i<=j) {
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

public class UpperTraiEx {

	public static void main(String[] args) {
		UpperTrai obj=new UpperTrai();
		obj.upper();
		obj.uppwe1();
	}

}
