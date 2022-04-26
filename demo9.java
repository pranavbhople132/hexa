final class car
{
	final int speed=200;
	void loan()
	
	{
		System.out.println("5 %");
	}
}
class sbi extends car
{
	void loan()
	{
		System.out.println("6 %"+speed);
	}
}
class demo9
{
	public static void main(String args[])
	{
		car c=new car();
		//c.speed=2000;
		System.out.println(c.speed);
	}
}