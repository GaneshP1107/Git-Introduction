package ExceptionHandEx;

public class ExceptionEx2 {

	public static void main(String[] args) {
         //multiple exception catch block and multiple exceptions
         try {
        	 int a=20,b=10;
        	 String s="java";
        	 int n[]=new int[3];
             System.out.println("DIVISION ="+a/b);
             System.out.println("your output sucessfully executed");
             System.out.println(s.charAt(2));
             System.out.println(n[5]);
		} catch (ArithmeticException ae) {
			System.out.println("catch block is executed"+ae);
		}catch (StringIndexOutOfBoundsException se) {
			System.out.println("Stringexception error"+se);
		}catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("Array Exception "+aie);
		}
         finally {
			System.out.println("finally block always be executed");
		}
	}

}
