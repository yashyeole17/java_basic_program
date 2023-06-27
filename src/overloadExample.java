class Customer 
{
	String  custName;
	int age;
	int custNo;
	String memShip;
	double point;
	public void printInfo(String  custName, int age, int custNo, String memShip,double point)
	{
		System.out.print(custName+" "+age+" "+custNo+" "+memShip+" "+point);
	}
	public void printInfo(String custName)
	{
		System.out.println(custName);
	}
}
public class overloadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer();
		c1.custName="yash";
		c1.age=22;
		c1.custNo=1;
		c1.memShip="male";
		c1.point=4.5;
		//c1.printInfo(c1.custName);
		c1.printInfo(c1.custName,c1.age,c1.custNo,c1.memShip,c1.point);
	}

}
