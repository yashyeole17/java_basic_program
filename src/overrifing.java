
class parent
{
	int x=10;
	void show()
	{
		System.out.println("Inside parent show");
	}
}
class Child extends parent
{
	int y=20;
	int x=100;
	void disp()
	{
		System.out.println("Inside child disp");
	}
}

public class overrifing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		System.out.println("  "+c1.x);
		c1.show();
		c1.disp();
	}

}
