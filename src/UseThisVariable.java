
class Box
{
	int w, b, h;
	//Box(){    }				//constructor create for overloading 
	Box(int w, int b, int h)
	{
		this.w=w; 
		this.b=b; 
		this.h=h;
	}
	Box(String s)
	{
		System.out.println("Box name "+s);
	}
	int volume()
	{
		return w*b*h;
	}
}


public class UseThisVariable {

	public static void main(String[] args) {
		
		Box b1= new Box(3,4,5);
		System.out.println("w= "+b1.w);
		int v=b1.volume();
		System.out.println("volume "+v);
		Box b2=new Box("Small box");
	}

}
