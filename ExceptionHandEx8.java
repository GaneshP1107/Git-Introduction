package ExceptionHandEx;
class IciciBank extends Exception{
	IciciBank(String name){
		super(name);
	}
}

public class ExceptionHandEx8 {

	public static void main(String[] args) {
		float Amount=200000.0f;
		int withdraw=10000;
		try {
			if (Amount<=withdraw) {
				System.out.println("cash is collected");
			}else {
				throw new IciciBank("your balance is insufficient");
			}
		} catch (IciciBank e) {
            System.out.println(e);
		}

	}

}
