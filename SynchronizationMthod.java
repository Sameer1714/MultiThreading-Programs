package Home;

class BookTicket{
	
	int total_seat=10;
	synchronized public void book(int seat) {
		
		if(total_seat>=seat) {
			System.out.println("Seats Book SucessFully.....!");
			total_seat-=seat;
		}
		else {
			System.out.println("Seats Not Book");
			System.out.println("Available seats :"+total_seat);
		}
	}
}

public class SynchronizationMthod extends Thread
{
	static BookTicket b;
	int seat;
	public void run() {
		
		b.book(seat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		b=new BookTicket();
		
		SynchronizationMthod s=new SynchronizationMthod();
		s.seat=7;
		s.start();
		
		SynchronizationMthod s2=new SynchronizationMthod();
		s2.seat=6;
		s2.start();
	}

}
