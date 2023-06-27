

class Outer			//class under class known as nasted class
{
	static int x=100;
	
	public void display()
	{
		System.out.println("Outer class");
		inner i1=new inner();
		i1.display();
		
	}
	class inner
	{
		public void display()
		{
			System.out.println("Inner class");
			System.out.println("x= "+x);
			x++;
		}
	}
}

public class nastedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer o1=new Outer();
		o1.display();
		
	}

}
