package Package1;
class Basee{
	int x=10,y=20;
	
	void parent() {
		System.out.println("parent class");
		x=x;
		y=y;
		System.out.println("x val "+x+"y val "+y);
	}
}
class Childg extends  Basee{
	int add;
	void addition() {
		System.out.println("child class");
		x=x;
		y=y;
		System.out.println("addition "+(x+y));
	}
}

public class SingInh {

	public static void main(String[] args) {
         System.out.println("main method");
         Childg p=new Childg();
         p.parent();
         p.addition();
	}

}
