package ExceptionHandEx;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
class Amount{
	 BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	 void hello() throws IOException {
     System.out.println("enter anything");
     String s=ob.readLine();
     System.out.println(s);
     int a=10,b=1;
//     while (a>=b) {
//		System.out.println("hello");
//		a--;
//	}
}}
public class Checked_Exception_Ex {

	public static void main(String[] args) throws IOException 
	{
		Amount A=new Amount();
		A.hello();
	}

}