//  create a class to print the area of square and 
// area of rectangle overload the are method for calculating the same

class Square 
{
	public void area(int side)
	{
		System.out.println("Area of Square: "+side*side);
	}
	public void area(float length, float breadth)
	{
		System.out.println("Area of Rectangle: "+0.5*length*breadth);
	}
}
public class areaByOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s1=new Square();
		s1.area(5);
		s1.area(4.0f,5.0f);		
	}
}
