package Home;

class Prior extends Thread
{
	public void run() {
		System.out.println(" thread is running");
		System.out.println(Thread.currentThread().getPriority());
	}
}

public class PrioritiesOfThread {

	private static int MAX_PRIORITY;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread.currentThread();
		System.out.println(Thread.currentThread().getPriority());
		
		Prior p=new Prior();
		p.setPriority(MAX_PRIORITY);
		p.start();
		
	   System.out.println("::::::::::::::::::::::;");
	}

}
