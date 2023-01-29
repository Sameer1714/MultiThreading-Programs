package Home;

class t1  extends Thread
{
	
	t1(String name)
	{
		run(name);
	}
	
	public void run(String name) 
	{
		System.out.println(name);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		t1 t=new t1("sameer");
		
		t.start();
		
		System.out.println(t.getName());
	}

}
