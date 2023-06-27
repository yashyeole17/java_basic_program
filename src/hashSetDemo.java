import java.util.HashSet;
import java.util.Iterator;
public class hashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> s1=new HashSet<>();
		
		//insert 
		s1.add(50);
		s1.add(30);
		s1.add(25);
		s1.add(15);
		s1.add(35);
		////print all elements
		System.out.println(s1);
		
		//size
		System.out.println("size of hasghset: "+s1.size());
		
		//search ELement present or not
		if(s1.contains(25))
		{
			System.out.println("element contains");
		}
		if(!s1.contains(25))
		{
			System.out.println("element Not contains");
		}
		
		
		//delete
		s1.remove(50);
		System.out.println(s1);
		if(!s1.contains(50))
		{
			System.out.println("Does not contains  we delete");
		}
	
		//iterator (Loop)
		Iterator i1= s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next()+"  ");
		}
	}

}
