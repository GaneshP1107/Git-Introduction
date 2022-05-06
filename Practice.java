package Package1;

abstract class ads{
	abstract void  rrr();
	abstract void kgf();
	void pushpa() {
		System.out.println("Thaggedhele");
	}
}
abstract class ADD extends ads{
	
	void rrr() {
		super.pushpa();
		System.out.println("Abstract Method:");

	}
	void kgf() {
		System.out.println("kgf");
	}
}
class boxoffice extends ADD{
	void amb() {
		System.out.println("hello world");
	}
}
public class Practice {
	public static void main(String[] args) {
		System.out.println("This is Main Method:");
//		ADD AA = new ADD();
//		AA.rrr();
		boxoffice bo = new boxoffice();
		bo.amb();
		bo.kgf();
		bo.rrr();
		//bo.pushpa();
	}
}
