package Package1;
class Parent2{
	void parent() {
		System.out.println("AMB Mall");
	}
}
class ChildC extends Parent2{
	void child(int a,int b) {
		System.out.println("Family was");
	}
}
class Kid extends Parent2{
	void kid() {
		System.out.println("Going");
	}
}

public class HeirarchicalInheritance {

	public static void main(String[] args) {
	System.out.println("this is main method");
    Kid am=new Kid();
    ChildC ob=new ChildC();
 
    am.parent();
    ob.child(10,10);
    am.kid();
    
	}

}
