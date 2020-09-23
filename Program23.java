import java.util.*;
class Program23
{
	static
    {
	System.out.println("do While Loop");
	System.out.println("1. Is a bottom tested loop");
	
    }
	static Scanner s1=new Scanner(System.in);
	static int i=0;
	static long value=2;
	public static void main(String args[])
	{
		do
		{
			long ans=value*value;
			System.out.println(i+" sq root of "+value+ " is :"+ans);
			value=ans;
			
			i++;
		}while(i<=4);
			
    }
 }