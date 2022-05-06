package ExceptionHandEx;
class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
		System.out.println("this is a constructor");
	}
}

public class ExceptionHandEx3 {

	public static void main(String[] args) {
		float withdraw=5000.0f;
		int Amount=2000;
	try {
		if (Amount<=withdraw) {
			System.out.println("YOUR CASH IS COLLECTED");
		}else {
			//System.out.println("INVALID");
			throw new MyException("Insufficient balance"); 
		}
		
	} catch (MyException e) {
		System.out.println(e);
	}
	}

}
