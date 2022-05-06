package multi.pack;
//creating thread by creating thread class
class MyThread extends Thread{
	public void run() {
		for (int i = 1; i <=5; i++) {
			try {
			Thread.sleep(1000);
			System.out.println("Thread is running"+Thread.currentThread().getName());
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
		}
	}
}

public class MutithreadingEx1 {

	public static void main(String[] args) {
		//if you want to create an obj that is one thread
		MyThread m1=new MyThread();
		m1.setName("T1");
		m1.start();
		MyThread m2=new MyThread();
		m2.setName("T2");
		m2.start();
		System.out.println(" Hello World !");
	}

}
