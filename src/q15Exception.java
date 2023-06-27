//  15. Write an application which will throw OverwtProductException if Product weight is above 60kg. 
//  (Use User defined exception) 


import java.util.*;
class OverwtProductException extends Exception
{
	OverwtProductException(String s)
	{
		super(s);
	}
}
class q15Exception
{
    public static void main(String[] args) throws OverwtProductException
    {   
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        try 
        {
            if(n>60)
            {
                throw new  OverwtProductException("Weight Overload");
            }
            else{
                System.out.println("Exception not found");
            }
			
		}
		catch (Exception e) {
			System.out.println("Exception occur"+e);
		}
    }
}
