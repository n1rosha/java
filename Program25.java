import java.util.*;
class Program25
{
	static
    {
	System.out.println("Nested Condition Statement");
	System.out.println("Keyword : break , continue");
    }
	static int i;
	public static void main(String args[])
	{
		for(i=0;i<=25;i++)
		{
			if(i%2==0)
			{
			System.out.println("i = "+i);
			//continue;
			break;
			}
		}
    }
 }