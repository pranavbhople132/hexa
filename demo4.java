import java.util.Scanner;
class clerk
{	
	int id;
	String name;
	int salary=15000;
	String designation="clerk";
	
	clerk()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
		id=sc.nextInt();
		System.out.print("Enter name: ");
		name=sc.next();
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}	
}
class dev
{	
	int id;
	String name;
	int salary=25000;
	String designation="dev";
	
	dev()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
		id=sc.nextInt();
		System.out.print("Enter name: ");
		name=sc.next();
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}	
}
class tester
{	
	int id;
	String name;
	int salary=20000;
	String designation="tester";
	
	tester()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
		id=sc.nextInt();
		System.out.print("Enter name: ");
		name=sc.next();
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}	
}
class manager
{	
	int id;
	String name;
	int salary=50000;
	String designation="manager";
	
	manager()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID: ");
		id=sc.nextInt();
		System.out.print("Enter name: ");
		name=sc.next();	
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}	
}
class demo4
{
	public static void main (String args[])
	{
	int ch = 0;
		do
		{
			Scanner sca = new Scanner(System.in);
			System.out.println("MENU\n 1.Clerk\n 2.Developer\n 3.Tester\n 4.Manager\n 5.Exit");
			ch = sca.nextInt();
			switch(ch)
			{
				case 1:
					clerk c = new clerk();
					c = null;
					System.gc();
					break;

				case 2:
					dev d = new dev();
					d = null;
					System.gc();
					break;

				case 3:
					tester t = new tester();
					t = null;
					System.gc();
					break;

				case 4:
					manager m = new manager();
					m = null;
					System.gc();
					break;
			}

		}while(ch!=5);
		System.out.println("Thank you");
	}

}