import java.util.*;
public class Tree_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating tree object
		TreeSet<Integer> t1=new TreeSet<Integer>();				//main treeSet 
		TreeSet<Integer> sub=new TreeSet<Integer>();			//sub class
		
		t1.add(10);
		t1.add(55);
		t1.add(64);
		t1.add(20);
		t1.add(23);
		t1.add(50);
		t1.add(40);
		t1.add(10);			// TreeSet does not allow duplicate values			
							// TreeSet always gives sorted elements
				
		System.out.println("TreeSet contents "+t1);
		
		System.out.println("TailSet 20= "+t1.tailSet(20));			// tailSet fuction gives values after 20 in array
		System.out.println("HeadSet 20= "+t1.headSet(20));			// headSet fuction gives value before 20 in array
	
		
		// Limiting the values till 5
        sub = (TreeSet<Integer>)t1.subSet(20, 25);
        System.out.println("Gives range in between "+sub);
	}

}
