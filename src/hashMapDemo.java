import java.util.*;
import java.util.Map.Entry;
//import java.util.HashMap;
public class hashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> h1= new HashMap<>();
		
		//treeset and hashset are having single value like (integer only)
		//but HashMap has pair (Integer,String)    BOTH
		
		//insert
		h1.put("Mumbai",45);
		h1.put("Pune",25);			//in TreeSet & HashSet adding element use object.add
		h1.put("Nagpur",35);		//in HashMap adding element use object.put
		h1.put("Satara",75);
		h1.put("Solapur",50);
		h1.put("Kolhapur",10);
		//Print
		System.out.println(h1);
		
		//duplicate
		h1.put("pune", 26);			//HashMap have duplicate but one of them in pair is different
		System.out.println(h1);
		
		//remove
		h1.remove("Satara");
		System.out.println(h1);
				
				
		//search
		if(h1.containsKey("raipur"))
		{
			System.out.println("Key Present");
		}
		else
		{
			System.out.println("Key not present");
		}
		
		//Search with value
		System.out.println(h1.get("Mumbai"));
		System.out.println(h1.get("raipur"));
		
		int array[]= {12,13,14,15};
		//loop regular type
		for(int value:array)
		{
			System.out.println(value+"  ");
		}
		/*		mistakes
		//Iteration (String, Integer)
		for(Map.Entry<String, Integer> e:h1.entrySet());
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
			
		//interation (String)
		Set<String> keys=h1.keySet();
		for(String key : keys)
		{
			System.out.println(Keys+" "+h1.get(key));
		}
	*/
	
		
		
	}

}
