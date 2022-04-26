class A
{
	int a=100;
	int b=200;
	void m1()
	{
		System.out.println("M1 :"+a);
	}
	void m2()
	{
		System.out.println("M2 :"+b);	
	}
}
class B extends A
{
	int c=400;
	int d=500;
	void m3()
	{
		System.out.println("M3 :"+c);
	}
	void m4()
	{
		System.out.println("M4 :"+d);
	}
}
class demo5
{
	public static void main(String args[])
	{
		A a=new A();
		a.m1();
		a.m2();
		B b=new B();
		b.m1();b.m2();b.m3();b.m4();
	}
}