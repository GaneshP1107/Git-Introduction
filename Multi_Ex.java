package multi.pack;

public class Multi_Ex extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("thread is running..."+Thread.currentThread());
		} catch (Exception e) {
		}
		
	}

	public static void main(String[] args) {
		Multi_Ex obj=new Multi_Ex();
		obj.start();
	}

}
