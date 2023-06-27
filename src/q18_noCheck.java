//18. Write code to check whether a no is a power of two or not? 

import java.util.Scanner;
class q18_noCheck
{
    public static void main(String[] args) 
    {
	System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
	int count=0;
        if (n > 0) 
        {            
            while (n % 2 == 0) 
            {                        // continously divide i if it is even
              n = n / 2;
	      count++;
            }         
            if (n == 1) 
            {                     // check if n is a power of 2
                System.out.println(" is a power of 2 & 2 rise to "+count);
            } 
            else 
            {
              System.out.println("No is not power of 2");
            }
        }
        else{
            System.out.println("Enter a valid positive number");
        }   
    }
}