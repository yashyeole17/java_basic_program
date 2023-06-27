
class OverLoad
{
	void Test()
	{
		System.out.println("No Parameter");
	}
	void Test(int i)
	{
		System.out.println("Int type parameter  "+i);
	}
	void Test(float i)
	{
		System.out.println("Float type parameter  "+i);
	}
	void Test(double i)
	{
		System.out.println("Double type parameter  "+i);
	}
	
}


public class overLoadingDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoad o1=new OverLoad();
		//int i=10;
		//float i=10.10f;
		double i=111;
		
		o1.Test();
		o1.Test(i);
		//o1.Test(i);
		//o1.Test(i);
	}

}
