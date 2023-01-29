package Home;

class single implements Runnable
{
	
	public void run() {
		
		System.out.println("performing single  Task Using Multiple THread");
		
	}
}


public class PerformingSingleTaskUsingMultipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      single s=new single();
      
      Thread t1=new Thread(s);
      
      t1.start();
      
      Thread t2=new Thread(s);
      
      t2.start();
      
	}

}
