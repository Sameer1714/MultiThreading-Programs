package Home;

public class CreateThreadUsingRunnableInterface implements Runnable 
{
	public void run() {
		System.out.println("Thread is run");
	}
	
	
  public static void main(String[] args) {
	  
	  CreateThreadUsingThredClass cd=new CreateThreadUsingThredClass();
	  
	  Thread t=new Thread(cd);
	  
	  t.start();
	  
  }
}
