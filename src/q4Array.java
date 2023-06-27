// sorting elements prime and non prime 
public class q4Array {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int arr1[]=new int [10];
		int arr2[]=new int [10];
		int prime=0;
		int Nprime=0;
		for(int num=0; num<arr.length; num++)
		{
			int count=0;
			for(int i=2; i<num; i++)
			{
				if(arr[num] % i == 0)
				{
					count=1;
					break;
				}
			}
			if(count==1)
				{
					arr1[prime]=arr[num];
					prime++;
				}
				else
				{
					arr2[Nprime]=arr[num];
					Nprime++;
				}
		}
		System.out.println("Prime no are");
        for(int i=0; i<prime; i++){
        System.out.print( " "+arr1[i]);
        }
        System.out.println("");
        
        System.out.println("Non prime no are");
        for(int i=0; i<Nprime; i++){
        System.out.print(" "+arr2[i]);
		
	}
	}

}
