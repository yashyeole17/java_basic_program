
class testAgeException{
	static void validate(int age) throws InvalidAgeException{
		if(age<18) {
			throws new InvalidAgeException("Not Found");
		}
	}
}
public class Exception_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validate(17);
		}catch(Exception e) {
			System.out.println("Excception Occurs"+e);
		}
		System.out.println("Rest of the Data");
	}

}
