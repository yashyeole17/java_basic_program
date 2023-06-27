class accesorMethod {
	private int no;
	private String name;
	Student(int n, String s){
		this.no=n;
		this.name=s;
	}
	//accessor method
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
}
public class accessorMethod {
	public static void main(String[] args) {
		Student s=new Student(11,"yash");
		System.out.println(s.getNo()+"  "+s.getName());

	}

}
