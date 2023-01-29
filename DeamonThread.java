package Home;

class skyy extends Thread
{
	
	public void run() {
		
		System.out.println("it provide service to  the thread");
		
		System.out.println(Thread.currentThread().isDaemon());
	}
}

public class DeamonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Deamon thread runn in background of main thread ");
		
		skyy s=new skyy();
		
		s.setDaemon(true);
		
		s.start();
	}

}
