package Package1;
class MethodOverloading1 {
	int ar;
	float area;
	void AreaOfTheSq(int s) {
		
		ar=s*s;
		System.out.println("Area of the square :"+ar);
	}
	void AreaOfTheSq(int l,int b) {
		ar=l*b;
		System.out.println("Area of the rectangle :"+ar);
	}
	void AreaOfTheSq(float h,int b) {
		area=1/2*h*b;
		System.out.println("Area of the traiangle :"+ar);
		
	}
}

public class VarArgs {

	public static void main(String[] args) {
		
		MethodOverloading1 ob=new MethodOverloading1();
		ob.AreaOfTheSq(4);
		ob.AreaOfTheSq(3,4);
		ob.AreaOfTheSq(4.2f,2);
		
	}

}
