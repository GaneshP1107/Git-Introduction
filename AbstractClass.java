
package Package1;
abstract class Abs{
	abstract void method1();
	void show() {
		System.out.println("INSTANCE CLASS");
	}
	class Childs extends Abs{
		public void method1() {
			System.out.println("childs class ");
		}
	}
}

public class AbstractClass {

	public static void main(String[] args) {
       Child ch=new Child();
       ch.method();
       ch.method1(10,20, 0);
	} 

}
