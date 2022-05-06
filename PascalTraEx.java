package Package1;

public class PascalTraEx {

	public static void main(String[] args) {
		int i,j,k,n=6;
		System.out.println("pascal triangle");
         for ( i = 1; i <=n-1; i++) {
			for ( j = i; j <=n-1 ; j++) {
				System.out.print(" ");
			}
			int temp=1;
			for ( k = 1; k <=i; k++) {
				System.out.print(temp+" ");
				temp=temp*(i-k)/k;
				
			}
			System.out.println();
		}
	}

}
