package Package1;
class Parent{ 
	int x,y,z;
	void method1(int x,int y,int z) {
      System.out.println("parent class addition program");
      x=x;
      y=y;
      z=x+y;
      System.out.println("your result ="+z);
	}
	void method() {
		System.out.println("Parent class");
	}
}

class Child extends Parent{
	void method() {
		System.out.println("child class");
	}
}
class Child1 extends Parent{
	void method() {
		System.out.println("children class");
	}
}
class Child2 extends Parent{
	void method3() {
		System.out.println("child class");
	}
}



public class MethodOverriding {

	public static void main(String[] args) {
       Child obj=new Child();
       obj.method();
       obj.method1(20,40,50);
       Child1 c1= new Child1();
       c1.method();
       Child2 ch= new Child2();
       ch.method();
	}

}