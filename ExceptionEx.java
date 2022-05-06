package ExceptionHandEx;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("Exception handling program");
		
		try {
			//EX ON ARITHMETIC EXCEPTION
			int x=10,y=0;
			System.out.println("Divisable by ="+x/y);
			System.out.println("success");
		} 
		catch (ArithmeticException ae) 
		{
			System.out.println("we canot divisable with zero"+ae);
		}

	}

}
/*The Exception Handling in Java is one of the powerful mechanism to handle the runtime
  errors so that the normal flow of the application can be maintained
 */