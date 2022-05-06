package Package1;

interface  Stud{
	final static int x=10;
	public void message();
	public void calculate();
}
 class StudDemo implements Stud{
	 
	 int a=20;
	public void message() {
		int x=1,y=5;
		System.out.println("GOOD AFTERNOON "+(x+y));
	}
	public void calculate()
	{
		System.out.println("GOOD EVENING"+a);
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
		StudDemo ob=new StudDemo();
		ob.message();
		ob.calculate();
		System.out.println("static variable "+Stud.x);
		Stud in;
		in=new StudDemo();
		System.out.println("hello world "+in.x);
		
	}

}
