/*Create an Interface 'Animals' with abstract method 'void sound()' and default method ‘void 
walk()’. Implement abstract method in class 'Cat' & 'Dog'. Now create an object for each of 
the subclasses and call their respective methods and default method too.  */

interface Animals
{
	public void sound();
	public default void walk()
	{
	System.out.println("Aniaml walk on 4 Legs");
	}
}
class Cat implements Animals{
	public void sound(){
		System.out.println("Cat sound is nice");
	}
}
class Dog implements Animals{
	public void sound()
	{
		System.out.println("Dog sound is horrible");
	}
}
class q10interface
{
	public static void main(String Arg[])
	{
		Cat C=new Cat();
		C.sound();
		C.walk();

		Dog D=new Dog();
		D.sound();
		D.walk();	
	}
}