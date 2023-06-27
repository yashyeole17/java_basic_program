//the block which is not given by name is K/a init block
//static block print only one time and print at top (first)

class Initilize
{
	static
	{
		System.out.println("Inside static block");
	}
	Initilize()
	{
		System.out.println("Inside no argument constructor");
	}
	{
		System.out.println("inside init block");
	}	
}
public class initBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Initilize i1=new Initilize();
		System.out.println("Second block");
		Initilize i2=new Initilize();
	}

}
