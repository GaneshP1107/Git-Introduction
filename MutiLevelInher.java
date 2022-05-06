package Package1;
class A1{
	int id;
	String name;
	void displayDetails(int id,String name) { 
		System.out.println("class A");
		id=id;
		name=name;
		System.out.println("id and name"+id +"name "+name);
	}
	
}
class B extends A1{
	int m,p,c;
	void DisplayMark(int m,int p,int c) {
		System.out.println("class B");
		this.m=m;
		this.p=p;
		this.c=c;
		System.out.println("1.maths "+m+"\n2.physics "+p+"\n3.chemistry "+c);
	}
}
class C extends B{
	int total;
	void displaytot() {
		
		total=m+p+c;
		System.out.println("your result is ="+total);
	}
	
}

public class MutiLevelInher {

	public static void main(String[] args) {
		
       C vg=new C();
     //  vg.displayDetails(101,"vinod");
       vg.DisplayMark(89,89,90);
       vg.displaytot();
	}

}
