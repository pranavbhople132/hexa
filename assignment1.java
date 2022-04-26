import java.util.*;
class Emp
{
	String name;
	int age ;
	int sal;
	String desig;
	Emp()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("NAME : ");
		name=sc.next();		
		System.out.print("Age : ");
		age=sc.nextInt();
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("AGE  : "+age);
		System.out.println("SALARY : "+sal);
		System.out.println("Desig : "+desig);
	}
}
class Clerk extends Emp
{
	
	Clerk()
	{
		sal=15000;
		 desig="Clerk";			
	}
	
}
class Dev extends Emp
{
	
	Dev()
	{
		 sal=25000;
		desig="Developer";
	}
}
class manager extends Emp
{
	
	manager()
	{
		 sal=30000;
		desig="manager";
	}
}
class tester extends Emp
{
	
	tester()
	{
		 sal=20000;
		desig="tester";
	}
}
class assignment1
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		System.out.println ("Choice  : ");
		System.out.println("1 )Clerk  : ");
		System.out.println("2)Dev: ");
		System.out.println("3)manager: ");
		System.out.println("4)tester: ");
		System.out.println("5)exit:");
		int ch=sc.nextInt();
		if(ch==1)
		{
			Clerk c =new Clerk();
			c.display();
		}
		if(ch==2)
		{
			Dev d=new Dev();
			d.display();
		}	
		if(ch==3)
		{
			manager m=new manager();
			m.display();
		}
		if(ch==4)
		{
			tester t=new tester();
			t.display();
		}
		if(ch==5)
		{
			System.out.println("Thank you");
		}
	
	}
}