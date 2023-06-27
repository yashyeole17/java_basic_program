// Create a class of Customer with members Cust_nm, age, contact num, membership, reward_points.
// Demonstrate Constructor Overloading in the same. 

class Customer
{
    String name;
    int age;
    int contact;
    String member;
    double rewardpt;
    Customer(String name) {
        this.name = name ;
    }
    Customer(String name, int age,int contact) {
        this.name = name ;
        this.age = age;
        this.contact = contact;
    } 
    Customer(String name, int age,int contact,String menber, double rewqrdpt) {
        this.name = name ;
        this.age = age;
        this.contact = contact;
        this.member = menber;
        this.rewardpt = rewqrdpt;
    }
}
class Q3overOne
{
    public static void main(String[] args) 
    {
        // Customer c1 = new Customer("abc",33,888);

        // System.out.println(c1.name);
        // System.out.println(c1.age);
        // System.out.println(c1.contact); 

        Customer c2 = new Customer("abc",33,888,"male",4.5);
         System.out.println(c2.name);
         System.out.println(c2.age);
         System.out.println(c2.contact); 
         System.out.println(c2.member);
         System.out.println(c2.rewardpt); 

        //Customer c3 = new Customer("abc");
        //System.out.println(c3.name);

    }
}