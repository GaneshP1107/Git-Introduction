package multi.pack;
//Multi_threading and Multi_Tasks
 class Printing implements Runnable{
	public void run() {
		for (int i = 0; i <=5 ; i++) {
			try {
				System.out.println(i+" "+Thread.currentThread().getName()+" is running ");
				Thread.sleep(1000);
				//System.out.println(i);
			} catch (Exception e) {
			}
			
		}
	}
}
 class Scanner extends Thread{
	public void run() {
		for (int i = 0; i <=5 ; i++) {
			try {
				System.out.println(i+" "+Thread.currentThread().getName()+" is running ");
				Thread.sleep(1000);
				//System.out.println(i);
			} catch (Exception e) {
			}
			
		}
	}
}
 class Downloading extends Thread{
		public void run() {
			for (int i = 0; i <=5 ; i++) {
				try {
					System.out.println(i+" "+Thread.currentThread().getName()+" is running ");
					Thread.sleep(1000);
					//System.out.println(i);
				} catch (Exception e) {
				}
				
			}
		}
	}

public class MultiThreading_MultiTask {

	public static void main(String[] args) {
		Printing obj=new Printing();
		Scanner obj1=new Scanner();
		Downloading obj2=new Downloading();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		Thread t3=new Thread(obj2);
		
	    t1.setName("Venu");
	    t2.setName("Ganesh");
	    t3.setName("Kalyan");
	    
		t1.start();
		t2.start();
		t3.start();
		
	}

}
