
class Test
{
	int a;
	int b;
	Test(int i, int j)
	{
		a=i;
		b=j;
	}
		public void math(int a, int b)
		{
			a=i++;
			b=++j;
		}
			public void meth(Test )
			{
				o.a*=a;
				o.b*=b;
			}
}

public class objectCalling 
{
	public static void main(String[] args) 
	{
		Test ob=new Test(15,20);
		System.out.println("Before calling Object:"+ob.a+","+ob.b);
		ob.math(ob);
		System.out.println("After calling"+ob.a+", "+ob.b);
	}

}
