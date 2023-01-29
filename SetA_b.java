package Home;

class Reverse extends Thread
{
	public void run() {
		
		for(int i=100;i>=1;i--) {
			System.out.println(i);
		}
		Thread.currentThread().setName("sameer");
		
		System.out.println(Thread.currentThread().getName());
	}
}
public class SetA_b {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Reverse  r=new Reverse();
		r.start();	
	}

}
