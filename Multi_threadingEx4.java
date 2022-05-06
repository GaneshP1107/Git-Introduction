package multi.pack;

class Multi_threading  implements Runnable
{
   public void run() {
	   for (int i = 0; i <= 5; i++) {
		
		try {
			System.out.println(i+" "+Thread.currentThread().getName()+" is printing");
			Thread.sleep(1000);
			synchronized (this) {
				System.out.println("Synchronized block will be printed");
			}
		}
		catch (Exception e) {
			
		}
	}
   }
}
 class Multi_threadingEx4 
{
	public static void main(String[] args) {
	 
		Multi_threading obj=new Multi_threading();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
	    t1.setName("DOCUMENT 1");
		t2.setName("DOCUMENT 2");
		t3.setName("DOCUMENT 3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
