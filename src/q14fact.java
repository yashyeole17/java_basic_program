/*  14. Write a try-catch block to calculate the factorial of the entered number.
    An exception should be handled if the entered number is negative.
    Use the Exception class.							 */


import java.util.*;

class InvalidInputException extends Exception
{
	InvalidInputException(String s)
	{
		super(s);
	}
}
class q14fact
{
    public static void main(String[] args) throws InvalidInputException
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        try 
        {   
            if(n<0){
                throw new InvalidInputException("Invalid");
            }
            else
            {
                for(int i=n; i>0; i--)
                {
                    fact=fact*i;
                }
		System.out.println(fact);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occur"+e);
        }
    }
}