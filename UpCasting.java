package Package1;
class Aa{
	void show3() {
		System.out.println("Parent class");
	}
}
class Bb extends Aa{
	void show4() {
		System.out.println("child class");
	}
}
class Cc extends Bb{
	void show5() {
		System.out.println("kid class");
	}
}

public class UpCasting {

	public static void main(String[] args) {
  System.out.println("main method");
  //this normal reference 
//  Cc c=new Cc();
//  c.show3();
//  c.show4();
//  c.show5();
//  Aa aa=new Aa();
//  aa.show3();
//  Bb ab=new Bb();
//  ab.show3();
//  ab.show4();
  Aa aa=new Cc();//upcasting
  aa.show3();
//  Cc ac=(Cc)Bb;
//  ac.show3();
//  ac.show4();
  
	}

}
