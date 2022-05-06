package Package1;
import java.util.Scanner;
class studentt // parent
{
	int sno;
	String sname;
	Scanner sc= new Scanner(System.in);
	public void read()
	{
		System.out.println("enter student number and name");
		sno=sc.nextInt();
		sname=sc.next();
	}
	public void show()
	{
		System.out.println();
		System.out.println("the student no is " + sno);
		System.out.println("the student name is" + sname);
	}
}
class resultt extends studentt // childs
{
	int sub1,sub2,sub3;
	//float total,avg;
	Scanner sc = new Scanner(System.in);
	public void read1()
	{
		//super.read();
		System.out.println("Enter marks in sub1, sub2 and sub3");
		sub1=sc.nextInt();
		sub2=sc.nextInt();
		sub3=sc.nextInt();
	}
	public void show1()
	{	
		super.show();
//		total = sub1+sub2+sub3;
//		avg = total/3;
//		System.out.println("total = " + total);
//		System.out.println("average = " + avg);
	}
}
 
class gradesm extends studentt{
	float total,avg; 	
	public void read2() {
		super.read();
	}
	public void show2() {
		
		
	}
	
}


public class SingleInheriEx {

	public static void main(String[] args) {
		resultt r= new resultt();
		r.read();
        r.read1();
        r.show();
		r.show1();
		
	//	Finals f = new Finals();

	}

}
