//werite a program to display all the files having extension in java  MEANS vector demo 

import java.util.*;
public class vector_project_1122_pageNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v=new Vector<Integer>(3);		//3 is capacity
		System.out.println("Initial Size:- "+v.size());		//show initial size
		
		System.out.println("Initail capacity:- "+v.capacity());	  // show initial capacity
		
		v.addElement(10);
		v.addElement(20);				// when more than size elements  are added 	Vector is 								 
		v.addElement(30);				//	having a features of increasing	the capacity.
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		
		System.out.println(v);			//print elements
		
		//System.out.println("After addition of more than capacity elements:- "+v.capacity());
		
	/*	//other mmethod to print elements
		for(int i:v) {
			System.out.print(i+"  ");
	
		//Iterator (loop)   for print elements
		Iterator<Integer> vi= v.iterator();
		while(vi.hasNext()) {
			System.out.println(vi.next());
		}
		}
		
		Enumeration<Integer> vNum=Collections.enumeration(v);
		while(vNum.hasMoreElements()) {
			System.out.println(vNum.nextElement());
		}
	*/
	}

}
