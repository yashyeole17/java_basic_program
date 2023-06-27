public class zeroDemo 
{
	public static void main(String[] args) 
	{
  		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
  		int n = arr.length;
  		helperFunction(arr, n);
  		for (int i:arr)
		{
   			System.out.print(i+" ");
  		}
 	}
	 static void helperFunction(int arr[], int n)
	{
  		int count = 0;
   		for(int i:arr)
		{
    			if(i!=0)
			{
     			arr[count++] = i;
    			}
   		}
   		while(count<n)
		{
   			arr[count++] = 0;
   		}
 	}
}
