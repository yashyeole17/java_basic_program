/* Q 17: Given two array: 1,2,3,4,5 and 2,3,1,1,0,5,0,2,1 
	find which number is not present int the second array.    */

class  q17arrayDemo1
{
	public static void main(String[] args)
    	{
		int arr1[]={1,2,3,4,5};
        	int arr2[]={2,3,1,1,0,5,0,2,1};
        	boolean found=false;
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
                			found =true;
                    			break;
				}
				else
				{
					found = false;
				}
			}
			if(!found){
				System.out.println(arr1[i]+" :No is not present");
			}	
		}
	}
}