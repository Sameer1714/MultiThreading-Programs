package Home;

class Sam extends Thread
{
	static Thread mt;
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" :"+i);
				sleep(1000);
			}
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

public class JoinMethod {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		
		Sam s=new Sam();
		s.start();
		s.join();
		
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" :"+i);
		    Thread.currentThread();
			Thread.sleep(1000);
		}
		
		
	}

}
