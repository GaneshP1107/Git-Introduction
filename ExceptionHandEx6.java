package ExceptionHandEx;

class Venu extends Exception 
{
	Venu(String name)
	{
		super(name);
		
	}
}
public class ExceptionHandEx6{
	public static void main(String[] args) {
 		    int x=200;
		    int y=0;
		try {
				System.out.println("x and y divisible ="+(x/y));
			
		} 
		catch (Exception  ae) 
		{
			System.out.println(ae);
		}

	}
}

