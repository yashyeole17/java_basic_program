/*1.	Consider first 15 natural numbers and Find out:
			a.	Sum of odd numbers
			b.	Sum of even numbers
			c.	Sum of prime numbers			*/



import java.util.*;
class q1sumNo
{
	public static void main(String[] args)
	{
		int even=0;
		int odd=0;
		int prime=0;
		for(int i=1;i<=15;i++)
		{
			if(i%2==0){
				even+=i;
			}
			else{
				odd+=i;
			}
		}
		for(int number = 1; number <= 15; number++)  
		{  
			int count = 0;  
			for(int j = 2; j <= number/2 ; j++ )  
			{         
				if(number % j == 0)  
				{    
					count++;  
					break;  
				} 
			} 
		if(count == 0 && number != 1 )            
		{  
			prime+=number;  
		}   
		  
	}	
		System.out.println("Even numbers sum is- "+even);
		System.out.println("Odd numbers sum is- "+odd);
		System.out.println("Prime numbers sum is- "+prime);
	}
}