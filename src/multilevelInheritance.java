
class A
{
	A()
	{
		System.out.println(" Inside class A constructor");
	}
}
class B extends A
{
	B()
	{
		System.out.println(" Inside class B constructor");
	}
}
class C extends B
{
	C()
	{
		System.out.println(" Inside class C constructor");
	}
}
public class multilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1=new C();
		
		
	}

}
