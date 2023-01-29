package Home;
class Ex extends Thread
{
	public void run() {
		
		for(int i=1;i<=5;i++) {
			Thread.yield();
		System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
}

public class YeildMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Ex e=new Ex();
		e.start();
		
		for(int i=1;i<=5;i++) {
			
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}

}
