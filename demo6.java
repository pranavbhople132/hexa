import java.util.*;
class emp
{
	String name;
	String desig;
	emp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Name :");
		name=sc.next();
		System.out.print("Desig :");
		desig=sc.next();
	}
}
class clerk extends emp
{
	clerk()
	{
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Desig :"+desig);
	}
}
class dev extends emp
{
	dev()
	{
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Desig :"+desig);
	}
}
class tester extends emp
{
	tester()
	{
	}
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Desig :"+desig);
	}
}
class demo6
{
	public static void main(String args[])
	{
		clerk c=new clerk();
		c.display();
		dev d=new dev();
		d.display();
		tester t=new tester();
		t.display();
	}
}