package ExceptionHandEx;

import java.io.*;
import java.io.InputStreamReader;

public class ExceptionHandEx2 {

	public static void main(String[] args)  {
//		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
//	System.out.println("ENTER ANYTHING");
//		String name=obj.readLine();
//		System.out.println(name);
//		int s=Integer.parseInt(obj.readLine());
//		System.out.println(s);
				try {
					int a=10;
					int b=0;
					System.out.println("devision"+a/b);
					System.out.println("your program is executed");
                     
//			if (a<=b) {
//				System.out.println("your cash is colleted");
//			}
//			else {
//				System.out.println("your cash is not colleted");
//			}
		} catch (ArithmeticException e) {
			System.out.println(e);
			
		}finally {
			System.out.println("sjhgahgfyubjsbxjA");
		}
			
	}

}
