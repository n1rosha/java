import java.util.*;
class Program21
{
	static
    {
	System.out.println("Switch case demo");
	System.out.println("1. Add");
	System.out.println("2. Sub");
    }
	static int a,b,c;
	static int choice;
	static Scanner s1=new Scanner(System.in);
	
	public static void main(String args[])
	{
			System.out.print("Enter your choice :");
			choice=s1.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter A :");
					a=s1.nextInt();
					System.out.println("Enter B :");
					b=s1.nextInt();
					c=a+b;
					System.out.println("Sum of 2 no is :"+c);
					break;
				}
				
				case 2:
				{
					System.out.println("Enter A :");
					a=s1.nextInt();
					System.out.println("Enter B :");
					b=s1.nextInt();
					c=a-b;
					System.out.println("Substraction of 2 no is :"+c);
					break;
				}
				default:
				{
					System.out.println("Invalid choice");
					break;
				}
			}
			
    }
 }