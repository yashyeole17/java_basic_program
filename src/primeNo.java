import java.util.Scanner;
public class primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Enter size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		
		//store element in array
		int arr[]=new int[10];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		
		int a=0;
		int arr1[]=new int[];
		//sorting prime no
		for(int num=0; num<arr.length; num++) {
			int flag=0;
			
			for(int i=2; i<num; i++) {
				if(arr[num] % i==0) {
					flag++;
					break;
				}
			}
			if(flag < 2) {
				arr1[a]=arr[num];
				a++;
			}
		}
		
		//print prime no
		System.out.println("Prime no are ");
		for(int i=0; i<a; i++) {
			System.out.println(arr[i]);	
		}
	}

}
