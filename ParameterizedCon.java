package Package1;
class Sample{
	int x,y;
	Sample(int x,int y){
		//constructor call Ex
		
		//constructor overloading
		//parameterized constructor with return type
		System.out.println("This is parameterized constructor");
		x=20;
		y=30;
		System.out.println("x value is "+x+" y value is "+y);
	}
	Sample(){
		//this(10,20,30);
		//default constructor with no return type
		int x=1;
		int y=2;
		System.out.println("this is default constructor");
		System.out.println("x value is "+x+" y value is "+y);
	}
	Sample(int a,int b, int c){
	//	super(101,102);
	   System.out.println("this is three parameters");
	   System.out.println("a val "+a+" b val "+b+" c val"+c);
	}
}

public class ParameterizedCon {

	public static void main(String[] args) {
		System.out.println("this is main method");
		new Sample(10,20);
		//new Sample();

	}

}
