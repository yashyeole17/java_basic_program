
//13. Create Student Roll, Name, City) array and retrieve the information of student who belong

//to City Mumbai.
class Student
{
 	int rollNo;
 	String name;
 	String city;
 	Student(int rollNo, String name, String city)
	{
  		this.rollNo = rollNo;
  		this.name = name;
  		this.city = city;
 	}
 	public String toString()
	{
		return rollNo+" "+name+" "+city;
 	}
}
public class q13cityy 
{
 	public static void main(String[] args) 
	{
  		Student s1 = new Student(11, "Aman", "Pune");
  		Student s2 = new Student(22, "Rman", "Nagpur");
  		Student s3 = new Student(33, "Ram", "Satara");
  		Student s4 = new Student(44, "Sham", "Mumbai");

  		Student std[] = {s1,s2,s3,s4};

 		System.out.println("Students from Mumbai city is:");
  		for(Student s:std)
		{
   			if(s.city=="Mumbai")
			{
    				System.out.println(s);
   			}
 		}
 	}
}

