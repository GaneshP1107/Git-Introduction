package ExceptionHandEx;
class Message extends Exception{
	Message(String s){
		super(s);
	}
}
public class ExceptionHandEx7 {

	public static void main(String[] args) {
    int i=20;
    int y=0;
    try {
		if (i<=y) {
			System.out.println("your cash is collected");
		}else {
		   throw new Message("your bal is insufficient");
		}
	} catch (Message e) {
		System.out.println(e);
	}
	}
}
