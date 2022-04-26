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
class demo7
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		System.out.println ("Choice  : ");
		System.out.println("1 )Clerk  : ");
		System.out.println("2)Dev: ");
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
	
	}
}