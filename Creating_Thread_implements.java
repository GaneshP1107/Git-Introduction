package multi.pack;

public class Creating_Thread_implements  implements Runnable{
	//Creating thread using implements Runnable interface
	public void run() {
		
			try {
				System.out.println("print the numbers using sleep()");
				for (int i = 0; i <=5 ; i++) {
//				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(i+" Thread is ruuning "+Thread.currentThread().getName());
			} 
	}		   catch (Exception e) {
				System.out.println("Exception error");
			}
		


	}

	public static void main(String[] args) throws Exception {
		Creating_Thread_implements obj=new Creating_Thread_implements();
		Thread t1=new Thread(obj);
		t1.setName("Ganesh");
		t1.start();
		
		Creating_Thread_implements obj1=new Creating_Thread_implements();
		Thread t2=new Thread(obj1);
		t2.setName("Venu");
		t2.start();
		
			}

}
