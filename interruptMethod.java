package Home;

class Intro extends Thread
{
	public void run() {
		//System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().interrupted());
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				sleep(1000);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		//System.out.println(Thread.interrupted());
	}
}

public class interruptMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Intro I1=new Intro();
		I1.start();
		I1.interrupt();
		
		//System.out.println(I1.isInterrupted());
	}

}
