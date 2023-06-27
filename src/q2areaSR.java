/*	2. Create a class to print the area of a square and a rectangle. 
	Overload the area method for calculating the same. */


class Square
{
	public void area(int length)
	{    
		System.out.println("Areas of square:- "+length*length);
	}
    	public void area(int length, int breadth)
	{
		System.out.println("Areas of rectangle:- "+length*breadth);
	}
}
class q2areaSR
{
    public static void main(String []args) 
    {
        Square a1= new Square();
        a1.area(5);
        a1.area(5,6);
    }
}