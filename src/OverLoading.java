
class Box
{
	int w,b,h;
	Box(){   }					//constructor for overLoading
	Box(int wh, int br, int ht)
	{
		w=wh;b=br; h=ht;
	}
	Box(String s)
	{
		System.out.println("Box name:- "+s);
	}
	int volume()
	{
		return w*b*h;
	}
}

public class OverLoading {

	public static void main(String[] args) {
	
		Box b1=new Box(3,4,5);
		System.out.println("W= "+b1.w);
		int v=b1.volume();
		System.out.println("volume= "+v);
		Box b2=new Box("Small Box");
	}

}
