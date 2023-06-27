
class AA
{
	void callme()
	{
		System.out.println("Inside A");
	}
}

class BB extends AA
{
	void callme()
	{
		System.out.println("Inside B");
	}
}

class CC extends AA
{
	void callme()
	{
		System.out.println("Inside C");
	}

}

public class Static_Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA a=new AA();
		BB b=new BB();
		CC c=new CC();
		c.callme();
		AA r,  				//r is reference of A
		
		r=a; 
		r.callme();
		System.out.println("r is pointing to class"+r.getclass());
		
		r=b;
		r.callme();
		System.out.println("r is pointing to class"+r.getclass());
		
		r=c; 
		r.callme();
	}

}
