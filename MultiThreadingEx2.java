package multi.pack;
//Ex1
class Multithreading extends Thread{
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("multithreading 1st program ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class MultiThreadingEx2 {

	public static void main(String[] args) {
		Multithreading ob=new Multithreading();
		ob.start();
		Multithreading ob1=new Multithreading();
		ob1.start();
	}

}
