package Home;


public class JoinMethod2 extends Thread
{
	static Thread mt;
	public void run() 
	{
		try
		{
			mt.join();
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" :"+i);
				sleep(1000);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
         mt=Thread.currentThread();
		JoinMethod2 m=new JoinMethod2();
		m.start();
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			sleep(1000);
		}
		
	}
}
