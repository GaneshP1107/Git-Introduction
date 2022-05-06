package Package1;
interface Marolix{
	public void readM(); 
}

class Company1 implements Marolix{
	public void methodk() {
		System.out.println("hello ");
	}
	public void readM() {
		System.out.println("Ganesh");
	}
}

public class InterfaceEx1 {

	public static void main(String[] args) {
		Company1 as=new Company1();
		as.methodk(); 
		as.readM();
	}

}
