/*  	8. Design an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n).
	You need to write a class called MyCalculator which implements the interface.
	q divisor_sum(int n) function takes an integer as input and return the sum of all its divisors. 
	Divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. (0<n)          */


import java.util.*;
interface AdvancedArithmetic
{
	int divisorSum(int n); 		
}
class MyCalculator implements AdvancedArithmetic
{
    int sum=0;
    public int divisorSum(int n)
    {
	for(int i=1; i<=n; i++)
	{		
        	if(n%i==0)
		{
			sum=sum+i;	
		}
    	}
	return sum;
    }
}
class q8Sum
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        AdvancedArithmetic m1=new MyCalculator();
        int sum= m1.divisorSum(n);
        System.out.println("Answwer= "+sum);
    }
}
        
         