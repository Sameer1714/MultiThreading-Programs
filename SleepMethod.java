package Home;

class Testt extends Thread
{
	public void run() {
		
		try {
			for(int i=0;i<=9;i++) {
				System.out.println(i);
				sleep(3000);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

public class SleepMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testt t1=new Testt();
		
		t1.start();
	}

}
