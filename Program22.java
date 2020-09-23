import java.util.*;
class Program22
{
	static
    {
	System.out.println("While Loop");
	System.out.println("1. Is a top tested loop");
	
    }
	static int sid;
	static String name;
	static String course;
	static int mark;
	static Scanner s1=new Scanner(System.in);
	static Scanner s2=new Scanner(System.in);
	static int i=3;
	public static void main(String args[])
	{
		while(i<=3)
		{
			System.out.println("----------"+i+ " Enter the Student Details -----");
			System.out.print("Enter Sid :");
			sid=s1.nextInt();
			System.out.print("Enter Name :");
			name=s2.nextLine();
			System.out.print("Enter Course :");
			course=s2.nextLine();
			System.out.print("Enter Mark :");
			mark=s1.nextInt();
			System.out.println("********** Student Details *************");
			System.out.println("Student id :"+sid);
			System.out.println("Student Name :"+name);
			System.out.println("Student Course :"+course);
			System.out.println("Student Mark :"+mark);
			
			i++;
		}
			
    }
 }