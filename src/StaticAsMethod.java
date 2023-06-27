
class SimpleClass 
{
	static int x=100;
	int y=10;
	static void display()
	{
		int z=5;
		System.out.println("x= "+x);
		x++;
		System.out.println("z=  "+z);
	}
}

public class StaticAsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleClass s1=new SimpleClass();
		int x;
		s1.display();
		System.out.println("X1= "+s1.x);
		s1.x++;
		System.out.println("X2= "+s1.x);
		s1.x++;
		System.out.println("x3= "+s1.x);
	}

}
