class Addition
{
	private int b,ans1;
	public int a;
	public void getAddValue()
	  {
	  a=20;
	  b=2;
	  }
	public void calculateAdd()
	   {
	   ans1=a+b;
	   System.out.println("ADD:"+ans1);
	   } 
}
class Substaction extends Addition
{
	private int x,ans2;
	public void getSubValue()
	  {
	  x=5;
	  }
	public void calculateSub()
	   {
	   ans2=a-x;
	   System.out.println("SUBRACT:"+ans2);
	   } 
}

class Program4
{
	static
	{
		System.out.println("Single Level");
		
	}
	
	public static void main(String  arg[])
	{
		Substaction obj=new Substaction();
		obj.getAddValue();
		obj.getSubValue();
		obj.calculateAdd();
		obj.calculateSub();
	}
}