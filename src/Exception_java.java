import java.util.*;
public class Exception_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Hiii");
			System.out.println("Hello "+5/10);
		}
		catch(Exception e)
		{
			System.out.println("Ist Exception"+e);
		}
		//catch(ArithmaticException e)
		{
			System.out.println("II Exeption");
		}
		finally{
			System.out.println("closing Connection");
		}
	}

}
