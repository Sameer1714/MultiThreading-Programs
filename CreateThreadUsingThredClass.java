package Home;

public class CreateThreadUsingThredClass extends Thread
{
	
	public void run()
	{
		System.out.println("thread is ** running");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateThreadUsingThredClass c=new CreateThreadUsingThredClass();
		c.start();
		
	}

}
