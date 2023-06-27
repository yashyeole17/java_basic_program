interface Animal{
	public  void sound();
	public default void walk(){
		System.out.println("Animal walk on 4 legs");
	}
}
class Cat implements Animal{
	public void sound(){
		System.out.println("cat voice is beutiful ");
	}
}
class Dog implements Animal{
	public void sound(){
		System.out.println("dog voice is horrible");
	}
}

public class q3Animals {
	public static void main(String[] args)
	{
		Cat c= new Cat();
		c.walk();
		c.sound();
		
		Dog d=new Dog();
		d.walk();
		d.sound();
	}
}
