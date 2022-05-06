package Package1;
class Degreeg{
	void method(int b) {
		System.out.println("vinod chesedu");
	}
	void method() {
System.out.println("hello vinod");
	}
}
class Inter1 extends Degreeg{
	void method() {
		System.out.println("vinod cheiyledu");
	}
}
public class MethodOverridingEx {

	public static void main(String[] args) {
		Inter1 ob=new Inter1();
		ob.method();
		ob.method(20);
	}

}
