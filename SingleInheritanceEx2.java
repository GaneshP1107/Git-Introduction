package Package1;
import java.util.Scanner;

class Parentt{
	String name;
	int rollnum;
	
	void readP() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("parent class");
		System.out.println("Enter the student name and rollnum :");
		name=sc.next();
		System.out.println("Enter your rollnum :");
		rollnum=sc.nextInt();
		}
	void showP() {
		System.out.println("student name : "+name);
		System.out.println("student rollnum : "+rollnum);
	}
}
class Childd extends Parentt{
	int math,phy,che,total,avg;
	void readC() {
		super.readP();
		System.out.println("Child class");
		System.out.println("Enter the math,phy and chemistry marks :");
	   Scanner sc=new Scanner(System.in);
	   math=sc.nextInt();
	   phy=sc.nextInt();
	   che=sc.nextInt();
	  
	}
	void showC() {
		total=math+phy+che;
		avg=total/3;
		 if(avg<=50) {
			   System.out.println("rank is pass");
		   }else if(avg>=50 && avg<=60 ) {
			   System.out.println("rank is pass");
		   }else if(avg>=60 && avg <=70) {
			   System.out.println("rank is first class");
		   }else if(avg>=70 && avg<=80){
			   System.out.println("Distinction");
		}else if(avg >=80 && avg <=100) {
			System.out.println("University topper");
		}
		
		System.out.println("total result is : "+total);
		System.out.println("Avg marks : "+avg);
	}
		
}

public class SingleInheritanceEx2 {
       static int x,y;
	public static void main(String[] args) {
		System.out.println("single inheritanceEx2 :");
		Childd ch=new Childd();
		//ch.readP();
		ch.readC();
		ch.showP();
		ch.showC();
		
	}

}
