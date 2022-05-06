package multi.pack;

public class Set_Priority implements Runnable {
	//Single task with multi_threading 
	//  Set priority
	public void run() {
		try {
			System.out.println(" Set priority  ");
			for (int i = 0; i <= 5; i++) {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+" thread is running priority is "+Thread.currentThread().getPriority());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		Set_Priority obj=new Set_Priority();
		Thread t1=new Thread(obj);
	    t1.setName("venu"); // set name
	    t1.setPriority(Thread.MAX_PRIORITY); // set priority
	    t1.start();
	    
	    Set_Priority obj1=new Set_Priority();
		Thread t2=new Thread(obj1);
	    t2.setName("ganesh"); // set name
	    t2.setPriority(8); // set priority
	    t2.start();
	}

}
