//     16. Exchange the numbers so that addition is same Exchange exactly one number
//     (one number from each array) from two arrays so that the addition of numbers 
//    in both the arrays comes out to be same.
 

import java.util.Arrays;

class q16sumNo
{
	public static void main (String[] args)
	{
		int arr1[]={5,4,6};             //first array
		int arr2[]= {2,8,1};	  	//Second array

		helperFunction(arr1,  arr2);
  		System.out.println(Arrays.toString(arr1)+" "+getSum(arr1));
  		System.out.println(Arrays.toString(arr2)+" "+getSum(arr2));
	}
	static int getSum(int array[])
	{
		int sum = 0;
		for (int i:array)
			sum= sum+i;
			return sum;
	}
	static void helperFunction(int arr1[], int arr2[])
	{
		int sum1 = getSum(arr1);
		int sum2 = getSum(arr2);
  		for(int i = 0; i<arr1.length; i++)
		{
   			for(int j = 0; j<arr2.length; j++)
			{
    				int newSum1 = sum1 - arr1[i] + arr2[j];
    				int newSum2 = sum2 - arr2[j] + arr1[i];
    				if(newSum1 == newSum2)
				{
     					int x =arr1[i];		//x= temporary variable used for swapping
     					arr1[i] =arr2[j];
     					arr2[j] = x;
     					return;
    				}
  			}
  		}
	}
}
