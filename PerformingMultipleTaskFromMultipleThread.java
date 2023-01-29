package Home;

class MyThread1 extends Thread
{
	public void run() {
		System.out.println("Task 1 ");
	}
}
class MyThread2 extends Thread
{
	public void run() {
		System.out.println("Task 2");
	}
}
public class PerformingMultipleTaskFromMultipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThread1 m1=new MyThread1();
       m1.start();
       
       MyThread2 m2=new MyThread2();
       m2.start();
	}

}
