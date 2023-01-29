package Home;

class Medical extends Thread
{
	public void run()
	{
		System.out.println("Medical test");
	}
}
class Driving extends Medical
{
	public void run() 
	{	try
	   {
		 
		 System.out.println("Driving test");
	   }
	   catch (Exception e) {
		// TODO: handle exception
	   }
	}
}

class LicenceOffice extends Driving
{
	public void run()
	{
		try
		{
			Medical m=new Medical();
			 m.start();
			Driving d=new Driving();
			d.start();
			d.join();
		   System.out.println("Congratulation YourDriving Licence Ready...");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
public class JoinMethod3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		LicenceOffice o=new LicenceOffice();
		o.start();
		
	}

}
