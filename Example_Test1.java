package ExceptionHandEx;
public class Example_Test1 {

	public static void main(String[] args) {
		System.out.println("Triangle");
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = n; j >=1 ; j--) {
				if (j!=i) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}

}

/* 
5432*
543*1
54*21
5*321
*4321
  */