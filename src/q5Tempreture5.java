/*5. Write a program to identify the maximum temperature among given 5 cities. (Consider 
Temperature class with temp variable. Hint:(use Static)
*/
class Temp
{
	static int MaxTemp=0;
	public static String City;
	void Maxtemp(String A,int N)
	{
		int n=N;
		if(n>MaxTemp)
		{
			MaxTemp=N;
			City=A;
		}
	}
}
class q5Tempreture5{
	public static void main(String Args[])
	{
		Temp T=new Temp();
		T.Maxtemp("Mumbai",20);
		T.Maxtemp("Jaipur",10);
		T.Maxtemp("Satara",30);
		T.Maxtemp("Nagpur",40);
		T.Maxtemp("Delhi",35);
		System.out.println("Maximum Tempreture is " +Temp.MaxTemp+" Of "+Temp.City);
	}
}
