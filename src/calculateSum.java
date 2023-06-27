
public class calculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int odd=0;
		int even=0;
		int prime=0;
		for(int i=0; i<15; i++)
		{
			if(i%2==0){
				even+=i;
			}
			else{
				odd+=i;
			}
		}
		for(int i=1; i<15; i++)
		{
			int count=0;
			for(int j=2; j<i/2; j++)
			{
				if(i%j==0) {
					count++;
				}
			}
			if(count==0 && i!=1)
			{
				prime+=i;
			}
		}
		System.out.println("Sum of even: "+even);
		System.out.println("Sum of odd: "+odd);
		System.out.println("Sum of prime: "+prime);
	}

}
