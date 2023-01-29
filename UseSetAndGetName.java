package Home;
class sky extends Thread
{
	public void run() {
		
		System.out.println("run thread Task");
		System.out.println("in run method ::"+Thread.currentThread().getName());
	}
}

public class UseSetAndGetName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(Thread.currentThread().getName());
         
          Thread.currentThread().setName("Sameer");
          
          System.out.println("main :"+Thread.currentThread().getName());
          
          
          
          sky s=new sky();
          s.start(); 
          System.out.println(":::::::::::::::::");
          s.setName("domale");
          System.out.println("in main method ::"+s.getName());
          System.out.println(":::::::::::::::::");
          System.out.println(":::::::::::::::::");
          System.out.println(s.isAlive());
          System.out.println(":::::::::::::::::");
          System.out.println(":::::::::::::::::");
          System.out.println(":::::::::::::::::");

	}

}
