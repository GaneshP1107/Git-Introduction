package ExceptionHandEx;
class NullPointerEx1 {
	int a=10,y=2;
	void test() {
		try {
			System.out.println("checked ex "+a/y);
			
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException "+e);
		}
	}
}

public class NullPointerEx {

	public static void main(String[] args) {
		System.out.println("main method");
	
		NullPointerEx1 ob=new NullPointerEx1();
		ob=null;
		
		try {
			ob.test();
		} catch (NullPointerException ae) {
			System.out.println("NullPointerException "+ae);
		}
	}

}
