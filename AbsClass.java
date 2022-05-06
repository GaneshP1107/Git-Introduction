package Package1;
interface Kalyan{
	void method();
}
abstract class VenuMadhav implements Kalyan{
	public void test() {
		System.out.println("hello");
	}
}
class Vinod1 extends VenuMadhav{
	public void method() {
		super.test();
		System.out.println("world");
	}
}

public class AbsClass {

	public static void main(String[] args) {
		Vinod1 obj=new Vinod1();
		obj.method();
	}

}
