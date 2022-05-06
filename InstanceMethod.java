package Package1;
class InstanceMethod1{
	static int x=50;
	static
	{
		System.out.println("this is Instance block 2");
	}
	{
		System.out.println("this is Instance block 3");
	}
}

public class InstanceMethod {
	static
	{
		System.out.println("this is Instance block1");
	}

	public static void main(String[] args) {
		System.out.println("this is main method");
		//InstanceMethod obj=new InstanceMethod();
		//InstanceMethod1 as=new InstanceMethod1();
		new InstanceMethod();
		System.out.println( InstanceMethod1.x);                       
	}

}
