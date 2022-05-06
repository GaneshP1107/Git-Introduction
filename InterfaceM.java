package Package1;

interface Inter{
	public void Interval();
	
}
interface Degree{
	public void Degree1();
}
class Pushpa implements Inter{
	
	public void Interval() {
		
		System.out.println("Thaggedhele");
	}
	class Inter implements Degree{
		public void Degree1() {
			System.out.println("ganesh");
		}
	}
}


public class InterfaceM {

	public static void main(String[] args) {

		Pushpa p = new Pushpa();
	  //  Degree g=new Degree();
		p.Interval();
	
//    	p.Degree1();
	}
}
