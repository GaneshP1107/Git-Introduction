package Do_WhileLoop;
abstract class Practice_Pro1 {
	abstract void method();
	void method1() {
		System.out.println("Instance class");
	}
}
class Childds extends Practice_Pro1{
	void method2() {
		System.out.println("child class");
	}

	@Override
	void method() {
		System.out.println("override to the abstract class");
	}
}
public class Practice_Pro_Ex {

	public static void main(String[] args) {
		Childds obj=new Childds();
		obj.method();
		obj.method1();
		obj.method2();
	}

}
