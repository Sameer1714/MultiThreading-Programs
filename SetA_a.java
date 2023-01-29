package Home;
class PrintMsg extends Thread
{
	String msg;
	int n;
	PrintMsg(String msg,int n){
		this.msg=msg;
		this.n=n;
	}
	
	public void run() {
		
		for(int i=1;i<=n;i++) {
			System.out.println(msg+"  :"+i);
		}
	}
}
public class SetA_a {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		PrintMsg p1=new PrintMsg("COVID19",10);
		p1.start();
		PrintMsg p2=new PrintMsg("LOCKDOWN2020",20);
		p2.start();
		p2.join();
		PrintMsg p3=new PrintMsg("VACCINATED2021",30);
		p3.start();
		p3.join();
		
	}

}
