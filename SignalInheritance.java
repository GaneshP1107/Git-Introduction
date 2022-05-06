package Package1;
class Parent1{
	int x,y,z;
	void Student(int x,int y,int z){
		x=x;
		y=y;
		z=x+y;
		System.out.println("My Result is :"+z);
	}
}
class Child3 extends Parent1{
	void Student1() {
		super.Student(10, 20, 20);
	//	this.Student1();
		System.out.println("hagdhgdjh");
	}
}
class Running extends Child3{
	void Student2() {
		this.Student1();
		System.out.println("hasdjhgsdsdsaads");
	}
}

public class SignalInheritance {

	public static void main(String[] args) {
     Running obj=new Running();
     obj.Student2();

	}

}
