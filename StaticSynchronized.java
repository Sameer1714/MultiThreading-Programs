package Home;

class BookMyshow
{
	static int totalseat=20;
	
	synchronized static void booktickets(int seat)
	{
		
		if(seat <= totalseat) 
		{
			System.out.println(seat+" Seat Book SucessFully...!");
		    totalseat=totalseat-seat;
		}
		else
		{
			System.out.println(seat +" Seat Not Booked");
			System.out.println("Available Seats are :"+totalseat);
		}
	}
}
class Mythread11 extends Thread
{
	BookMyshow b;
	int seat;
	
	public Mythread11(BookMyshow b,int seat) 
	{
		this.b=b;
		this.seat=seat;
	}
	public void run() {
		b.booktickets(seat);
	}
}
class Mythread22 extends Thread
{
	BookMyshow b;
	int seat;
	
	public Mythread22(BookMyshow b,int seat) 
	{
		this.b=b;
		this.seat=seat;
	}
	public void run() {
		b.booktickets(seat);
	}
}
public class StaticSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookMyshow b=new BookMyshow();
		
		Mythread11 m1=new Mythread11(b,6);
		m1.start();
		
		Mythread22 m2=new Mythread22(b, 7);
		m2.start();
		
		BookMyshow b2=new BookMyshow();
		
		Mythread11 m3=new Mythread11(b2,6);
		m3.start();
		
		Mythread22 m4=new Mythread22(b2, 9);
		m4.start();
		
	}

}
