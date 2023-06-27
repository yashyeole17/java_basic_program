

	import java.util.*;
	class stringBuilder{
		public static void main(String[] args){

			StringBuilder s=new StringBuilder("ramayan");
			
			//print
			System.out.println(s);
			
			//charIndex
			System.out.println(s.charAt(2));

			// set character at index perticular
			s.setCharAt(0,'Z');
			System.out.println(s);
		
			// insert char at index
			s.insert(0,'A');
			System.out.println(s);
			
			//delete char  at index
			s.delete(1,2);
			System.out.println(s);
		
			//length
			System.out.println(s.length());
		}	
	}
