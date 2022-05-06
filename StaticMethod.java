package Package1;

public class StaticMethod {
  static int a=89;

	public static void main(String[] args) {
		StaticMethod ob=new StaticMethod();
      System.out.println(a);
      System.out.println(StaticMethod.a);
      System.out.println(ob.a);
      
	}

}
