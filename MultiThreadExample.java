package Home;

class Abc implements Runnable
{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class Pqr implements Runnable{
	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class Xyz implements Runnable
{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class MultiThreadExample
{

	public static void main(String[] args) {
		Abc a1=new Abc();
		Thread t1=new Thread(a1);
		t1.start();
		
		Pqr p1=new Pqr();
		Thread t2=new Thread(p1);
		t2.start();
		
		Xyz x1=new Xyz();
		Thread t3=new Thread(x1);
		t3.start();
	}

}
