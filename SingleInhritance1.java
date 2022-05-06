package Package1;
class Base{
	int x,y,z;
	void Base1() {
		//Instance method
		x=20;
		y=30;
		z=x+y;
		System.out.println("Addition with single inheritance "+z);
	}
}
	class Derived extends Base{
		void Derived1() {
			System.out.println("hello world");
		}
	}
	public class SingleInhritance1 {
	public static void main(String[] args) {
		System.out.println("main method");
		//new SingleInhritance1().Parent();
		Derived ob=new Derived();
		//sob.
		ob.Base1();
		
		ob.Derived1();
	}

}
