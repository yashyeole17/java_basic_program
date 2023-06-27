// super keyword use for accessing the property of parent class
// super keyword is used in only child class for accessing parent class property

class Parent1
{
	int x=10;
	void show()
	{
		System.out.println("Inside parent class");
	}
}
class Child1 extends Parent1
{
	int y=20;
	int x=100;
	void disp()				//super access parent property
	{
		System.out.println("Inside Child Class x= "+super.x);
	}
	void disp()				
	{
		System.out.println("Inside Child Class x= "+x);
	}
}
public class superKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c1=new Child1();
		System.out.println("Super keyword: "+c1.x);
		c1.show();
		c1.disp();
	}
}
