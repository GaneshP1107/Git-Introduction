package Package1;

public class StaticBlock {
	static int x=20;
	static
	{
		System.out.println("x value "+x);
	}

	public static void main(String[] args) {
		System.out.println("this is main method");
	//	new StaticBlock();

	}

}
