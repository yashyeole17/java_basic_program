class Couter		//nested class
{
	static int x=10;
	public static Couter.Cinner Cinner;
	void test()
	{
		System.out.println("Outer class x= "+x);
		x++;
	}
	
	class Cinner
	{
		void display() 
		{
			System.out.println("Inner class x= "+x);
		}
	}
}
public class StaticInnerClass
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
			Couter o1=new Couter();
			o1.test();
			Couter.Cinner i1= o1.new Cinner();
			i1.display();
	}

}
