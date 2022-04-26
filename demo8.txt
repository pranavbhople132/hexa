class A
{
	int b=1000;
}
class B extends A
{
	int b=10;
	B(int b)
	{
		System.out.println("B :"+b);//100
		System.out.println("B :"+this.b);//10
		System.out.println("B :"+super.b);//1000
	}
}
class demo8
{
	public static void main(String args[])
	{
		B b=new B(100);
	}
}