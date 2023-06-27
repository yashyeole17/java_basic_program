import java.util.*;
public class arrayList
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 =new ArrayList<>();		//a1 object
		//add element
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		
		//to get element
		int element=a1.get(1);
		System.out.println(element);
		int element1=a1.get(2);
		System.out.println(element1);
		
		//add element in beetween
		a1.add(3,33);				//3 index 33 value
		System.out.println(a1);
		
		//delede element
		a1.remove(1);				//1 index
		System.out.println(a1);
		
		//size list
		int size =a1.size();			//length
		System.out.println(size);
	
		//loops on list
		for(int i=0; i<a1.size(); i++)
		{
			System.out.print(a1.get(i)+" " );
		}
		System.out.println( );
		
		//sorting list
		a1.add(0);
		Collections.sort(a1);
		System.out.println(a1);
		
	}

}
