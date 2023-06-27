import java.util.Scanner;

class Factorial
{
	public  void fact(int n)
	{
		if(n==0 || n==1)
		{
			return  1;
		}
		int factnm1=fact(n-1);
		int factNo=n*factnm1;
		return factNo;
	}
}


public class factorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//var n=sc.nextInt();

		Factorial f1=new Factorial();
		int n=5;
		f1.fact(n);
		
	}

}
