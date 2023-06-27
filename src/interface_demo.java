import java.util.Scanner;
interface AdvanceArithmatic 
{
	int divisorsum(int n);
}
class Mycalculator implements AdvanceArithmatic
{
	int sum=0;
	public int divisorsum(int n)
	{
		for(int i=0; i<n; i++) 
		{	
			if(n%i==0)
			{
				sum=sum+i;
			}		}
			return sum;
		}
	.
}
public class interface_demo 
{
	public static void main(String[] args) 
	{		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		AdvanceArithmatic m1=new Mycalculator();
		int sum=m1.divisorsum(n);
		System.out.println("Answer= "+sum);
	}

}
