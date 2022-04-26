import java.util.Scanner;
class A
{	
	static int a=1000;
	static void abc()
	{
		System.out.println("Hi");	
	}

		
}
class Demo2
{
	public static void main (String args[])
	{
		//A a=new A();
		A.abc();
		System.out.println(A.a);
	}
}