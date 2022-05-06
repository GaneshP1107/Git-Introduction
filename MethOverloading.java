package Package1;

public class MethOverloading {
	static
	{
	  System.out.println("Instance block 1");
	}

	public static void main(String[] args) {
		System.out.println("this is main method");
		//new InstanceBlock();
		new MethOverloading();
	}
}


//same method name with different parameters is called method overloading