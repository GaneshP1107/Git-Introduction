package Package1;

import java.util.Scanner;

class AcendingOrder{
	int i,j,temp;
	int n[]=new int[5];
	Scanner sc=new Scanner(System.in);
	void  Acending() {
		System.out.println(" AcendingOrder");
		for ( i = 0; i < 5; i++) {
			n[i]=sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			
		for ( j = 0; j < 5; j++) {
			
			if (n[i]<n[j]) {
				temp=n[i];
				n[i]=n[j];
				n[j]=temp;
			}
		}//System.out.println(temp);
			}System.out.println("DESCENDING ORDER");
		for ( i = 0; i < 5; i++) {
				System.out.println(" "+n[i]);
			}
		for (int i = 0; i < 5; i++) {
			
			for ( j = 0; j < 5; j++) {
				
				if (n[i]>n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}//System.out.println(temp);
				}System.out.println("DESCENDING ORDER");
			for ( i = 0; i < 5; i++) {
					System.out.println(" "+n[i]);
				}	
		
	}
}

public class AcendingOrderEx {

	public static void main(String[] args) {
		AcendingOrder ob=new AcendingOrder();
		ob.Acending();
	
	}

}
