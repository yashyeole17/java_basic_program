import java.util.*;
public class Hash_Set_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create hashSet object
		HashSet<Integer> h=new HashSet<Integer>();
		
		//add element
		h.add(40);
		h.add(69);
		h.add(48);
		h.add(19);
		h.add(67);
		h.add(78);
		
		System.out.println("Hash Set content "+h);			//length
		System.out.println("HashSet size "+h.size());		//size
		System.out.println("Insert duplicate element "+h.add(69)); 		//hashSet not allow duplicate value
	}

}
