package Home;

class BookTicket1{
	
	static int total_seat=10;
	 public void book(int seat)
	 {
		 System.out.println(Thread.currentThread().getName());
		synchronized(this) 
		{
		    if(total_seat>=seat) {
			   System.out.println(Thread.currentThread().getName()+" :Seats Book SucessFully.....!");
			   total_seat-=seat;
		    }
		    else {
			  System.out.println(Thread.currentThread().getName()+" :Seats Not Book");
			  System.out.println("Available seats :"+total_seat);
		   }
		}
		System.out.println(Thread.currentThread().getName());
	}
}
public class SynchronizedBlock extends Thread {
	static BookTicket1 b;
	int seat;
	public void run() {
		
		b.book(seat);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

			b=new BookTicket1();
			
			SynchronizedBlock s=new SynchronizedBlock();
			s.seat=7;
			s.start();
			
			SynchronizedBlock s2=new SynchronizedBlock();
			s2.seat=6;
			s2.start();
	}

}
