//6. Consider a class Loan and derive subclasses CarLoan, HomeLoan, EducationLoan. Add members and methods accordingly. 
//Override the method setCommissionRate();


class Loan{
	
}
class CarLoan extends Loan{
	public int  setCommissionRate() {
		return 7;
	}
}
class HomeLoan extends Loan{
	public int setCommissionRate() {
		return 8;
	}
}
class EduLoan extends Loan{
	public int setCommissionRate() {
		return 9;
	}
}
public class Q6overrideDemo 
{
	public static void main(String[] args) {
		CarLoan C1=new CarLoan();
		HomeLoan H1= new HomeLoan();
		EduLoan  E1=new EduLoan();
		System.out.println("Car Loan rate of intrest: "+C1.setCommissionRate());
		System.out.println("Home Loan rate of intrest: "+H1.setCommissionRate());
		System.out.println("Education rate of the intrest: "+E1.setCommissionRate());
	}
}
