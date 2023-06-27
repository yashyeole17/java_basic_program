//4. Create a Car class and define nested Engine class. 
//   Call void start() method from engine class. Assume suitable fields and methods.

class Car        				//outer base class
{
    int x;
    Car(int x){
        this.x=x;
    }

    class Engine{         			//nasted class
        public void start(){
            System.out.println(x);
            System.out.println("Engine has inner class");
        }
    }
}
class q4nestedDemo
{
    public static void main(String[] args)
    {
        Car c1=new Car(10);
        Car.Engine e1= c1.new Engine();
        e1.start();
    }
}