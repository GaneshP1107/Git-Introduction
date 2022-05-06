package Package1;
//Interface declaration 
interface Drawable
{  
void draw();  
}  
interface Drawable1{
	void draw1();
}
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw()
{
	System.out.println("drawing rectangle");
	}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");
}  
}  

public class InterfaceEx {
	public static void main(String[] args) {
		
		Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
		d.draw();  
		
		}
  } 
