import java.util.*;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="i am studying mca course";
		String reverse="";
		StringTokenizer st=new StringTokenizer(s);
		
		while(st.hasMoreTokens()){
			reverse=st.nextToken()+" "+reverse;
		}
		System.out.println("Original String "+s);
		System.out.println("Modified String "+reverse);
	}

}
