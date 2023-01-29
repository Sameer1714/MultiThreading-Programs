package Home;

class MyEarning extends Thread
{
	
	int total=0;
	public void run() {
		
		synchronized (this) 
		{
			for(int i=1;i<=10;i++) {
				total=total+100;
			}
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		MyEarning e=new MyEarning();
		e.start();
		
		synchronized(e) {
			e.wait();
			System.out.println(e.total);
		}
		
	}

}
