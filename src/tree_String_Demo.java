import java.util.*;
public class tree_String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> s=new TreeSet<String>();
		
		s.add("yash");
		s.add("ram");
		s.add("shyam");
		s.add("aditya");
		System.out.println("All names "+s);		//show in alphabetical order
		
		System.out.println(s.headSet("shyam"));		// gives before name
		System.out.println(s.tailSet("ram"));			//gives upto last
		
		
	}

}
