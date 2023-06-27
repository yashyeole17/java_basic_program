// 19 Write a code to display string in reverse order of words. 

import java.util.StringTokenizer; 
public class Q19ReverseString
{  
    public static void main(String args[])
    {  
        String s = "I am doing java program";
        StringTokenizer st = new StringTokenizer(s);   
        String reverseMessage = "";
        while(st.hasMoreTokens())
		{
		    reverseMessage = st.nextToken()+" "+reverseMessage;
		}
        System.out.println("Original String is :"+s);		
        System.out.println("Reversed String is :"+reverseMessage);
    }  
}  
