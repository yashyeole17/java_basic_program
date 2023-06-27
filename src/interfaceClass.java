
interface A1
{
	void call(int x);
	void disp();

}

class B1 implements A1
{
	public void call(int x)
	{
		System.out.println("x= "+x);
		int j=5;
		System.out.println("j= "+j);
	}
	void show()
	{
		System.out.println("Inside show");
	}
}

public class interfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 b1=new B1();
		b1.call(10);
		b1.show();
	}

}
