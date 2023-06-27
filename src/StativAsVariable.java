
class Abc
{
	static int i=5;
}							//static variable can store the updated value of the variable

public class StativAsVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc a1= new Abc();
		Abc a2= new Abc();
		System.out.println("Object 1 : "+a1.i);
		a1.i++;
		a1.i++;
		System.out.println("Object 2 : "+a2.i);
	}

}
