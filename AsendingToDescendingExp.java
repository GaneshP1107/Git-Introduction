package Package1;

import java.util.Scanner;

class AsendingOr{
	int i,j,temp;
	int n[]=new int [5];
	Scanner sc=new Scanner (System.in);
	void acending() {
		System.out.println("Asending order input values");
		for ( i = 0; i < 5; i++) {
		n[i]=sc.nextInt();
		}for ( i = 0; i < 5; i++) {
			for ( j = 0; j < 5; j++) {
				if (n[i]<=n[j]) {
				temp=n[i];
				n[i]=n[j];
				n[j]=temp;
				}
			}
			System.out.println("asending order output");
			for ( i = 0; i < 5; i++) {
				System.out.println(" "+n[i]);
			}
		}System.out.println();
	}
}

public class AsendingToDescendingExp {

	public static void main(String[] args) {
		AsendingOr ob=new AsendingOr();
		ob.acending();
	}

}
