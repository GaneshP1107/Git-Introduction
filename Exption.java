package ExceptionHandEx;

public class Exption {
	public static void main(String[] args) {
          try {
        	 
        	  int a=10;
        	  int b=2;
        	  int c=a/b;
        	  int n[]=new int[5];
        	  String name="hello world";
        	  System.out.println("c value is ="+a/b);
        	  System.out.println("array "+n[5]);
        	  System.out.println("String name ="+name);
        	 // System.out.println("char len ="+CharAt(2));
        	 
		} catch (ArithmeticException e) {
			System.out.println("Exception Error"+e);
		}catch (ArrayIndexOutOfBoundsException  ae) {
		    System.out.println("array exception error"+ae);
		}catch (StringIndexOutOfBoundsException se) {
			System.out.println("hello world");
		}finally {
			System.out.println("finally block always be executed");
		}
	}

}
