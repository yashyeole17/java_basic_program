import java.util.*;
public class ArrayList_collage_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create arraList
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		//add element
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		System.out.println("The elements are: "+a);
		
	/*	//traverse (Printing) array Elements
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}	
		
		//also used for printing elements
		for(int i:a)
		System.out.println(i);    */
	
		a.add(3,17);
		System.out.println("After element at 1 index: "+a);
		
		a.add(5,18);
		System.out.println("After element at 2 index: "+a);
		
		System.out.println("Index of element: "+a.indexOf(20));
	}
}
