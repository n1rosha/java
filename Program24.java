import java.util.*;
class Program24
{
	static
    {
	System.out.println("for Loop");
	System.out.println("1. Is a top tested loop");
	System.out.println("2. same as while loop");
	System.out.println("Welcome to ATM");
	
    }
	static String customerName="Tom";
	static String accNo ="SBI1001";
	static int accountBalance=30000;
	static final int  pinNo=1234;
	static Scanner s1=new Scanner(System.in);
	static int i;
	static int userPIN;
	
	public static void main(String args[])
	{
		for(i=1;i<=3;i++)
		{
			System.out.print("Enter Your PIN :");
			userPIN=s1.nextInt();
			if(userPIN==pinNo)
			{
				System.out.println("Account No :"+accNo);
				System.out.println("Customer Name :"+customerName);
				System.out.println("Current Balance  :"+accountBalance);
				
				//----- 1. Withdraw 2. Deposit
				
				
				System.exit(0);
			}
			else
			{
				if(i==3)
				{
					System.out.println(" YOur account is blocked sorry try again");
				}
				else
				{
				System.out.println("  Invalid Pin No ! Sorry Try again...");
				}
			}
		}			
    }
 }