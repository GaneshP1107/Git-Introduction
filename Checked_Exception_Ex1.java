package ExceptionHandEx;
import java.io.*;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;

public class Checked_Exception_Ex1  {

	public static void main(String[] args)  {
	BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter anything ");
      try {
    	   String name=obj.readLine();
    	   System.out.println(name);
	 }
     catch (IOException ae) 
      {
		ae.printStackTrace();
	}
	}

}
