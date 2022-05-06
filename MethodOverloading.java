package Package1;
class Student{
	void method1() {
		System.out.println("hello world");
	}

void method2(int x,int y) {
	System.out.println("integer numbers");
	x=10;
	y=20;
	System.out.println("result is"+(x+y));
}
}
public class MethodOverloading {

	public static void main(String[] args) {
		
		Student obj=new Student();
	
		obj.method1();
		obj.method2(12,30);
	}

}
