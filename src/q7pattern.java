/*	7. Print the pattern:	    5 
			       	10 15 20 
			     25 30 35 40 45
				50 55 60 
				   65
*/


class q7pattern
{
    public static void main(String []args) 
    {
        int i, j,k;
	int num=5, rrow=3;
        for(i=1; i<=rrow; i++)			
        {
	     
            for(j=rrow-i; j>0; j--)
            {
                System.out.print("  ");
            }
            for(k=1; k<= 2*i-1; k++)
	    {
		System.out.print(""+num+" ");
		num=num+5;
	    }
	    System.out.println();
		
        }
	int drow=2;
	for(i=2; i>=1; i--)
	{
		
     		for(j=drow-i; j>=0; j--)
     		{
	  		System.out.print("  ");
     		}
     		for(k=1; k<=drow*i-1; k++)
     		{
	   		System.out.print(""+num+" ");
			num=num+5;
     		}
		System.out.println("");	
	}
    }
}