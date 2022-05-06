package Package1;

public class PascalTraingle {

	public static void main(String[] args) {
		int n=6,i,j,k;
		//to print the first spaces
		for (i = 1; i <=n; i++) {
			for (j = i; j <=n-1; j++) {
				System.out.print(" ");
			}
			//secound to print the numbers
			int z=1;
			for ( k = 1; k <=i ; k++) {
				//System.out.print(k);
				System.out.print(z+" ");
				z=z*(i-k)/k;
				
			}
			System.out.println();
		}
	}
}
