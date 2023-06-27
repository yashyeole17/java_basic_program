import java.util.*;
public class additonLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		int num1=sc.nextInt();
		System.out.println("Enter Second number");
		int num2=sc.nextInt();
		System.out.println("Enter no 0 for add, 1 for sub,, 2 for multi, 3 for div");
		int choice=sc.nextInt();
		int add=0, sub=0, mul=0, div=0;
		for(int i=0; i<4; i++)
		{
			if(choice==0)		{	
				add=num1+num2;
				System.out.println("Adittion of numbers "+add);
				break;
			}
			else if(choice==1)	{ 	
				sub=num1-num2;	
				System.out.println("Substraction of numbers "+sub);
				break;
			}
			else if(choice==2)	{ 	
				mul=num1*num2;	
				System.out.println("Multiplicatoion of numbers "+mul);
				break;
			}
			else if(choice==3)	{	
				div=num1/num2;	
				System.out.println("Division of numbers"+div);
				break;
			}
			else { 	
				System.out.println("Enter enter 0 to 3"); 
				break;
				
				}
		}	
	}
}
