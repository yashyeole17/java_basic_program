

//11. Declare the integer array with 10 numbers.
// Generate 2 new arrays Prime and NonPrime with prime and non-prime numbers from main array. 

class  q11prime
{
    public static void main(String[] args)
    {
        int arr[]={5,2,3,4,5,6,7,8,9,10};
        int arr1[]=new int[10];
        int arr2[]=new int[10];
        int a=0, b=0;
        for(int num=0; num<arr.length; num++)
        {
           
           	int flag=0;
                for (int i = 2; i < num; i++)  
                {      
                    if(arr[num] % i == 0) { 
                    flag=1;  
                    break;  
                    }
                }
                if(flag == 1)
                {
                    arr1[a]=arr[num];
                    a++;
                }
                else
                {
                    arr2[b]=arr[num];
                    b++;
                }
            }
            System.out.println("non Prime no are");
                for(int i=0; i<a; i++){
                System.out.print( " "+arr1[i]);
                }
            System.out.println("");
                System.out.println("Prime no are");
                for(int i=0; i<b; i++){
                System.out.print(" "+arr2[i]);
                }

        
    }
}
