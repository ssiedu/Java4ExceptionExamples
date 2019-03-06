public class ExSix
{
public static void div(int a, int b)
{
	System.out.println("Starting Div");
	try
	{
	System.out.println(a/b);
	}
	catch(Exception e)
	{
	System.out.println("Handled By Div");
	}
	System.out.println("Ending Div");
}
public static void callDiv(int p, int q)
{
	System.out.println("Starting callDiv");
	try
	{
	div(p,q);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Handled By callDiv");
	}
	System.out.println("Ending callDiv");
}

public static void main(String args[])
{
	System.out.println("Starting Main");
	int x=0, y=0, z=0;
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);
	try{
	callDiv(x,y);
	}
	catch(ArithmeticException e)
	{
	System.out.println("Handled By Main");
	}
	System.out.println("Ending Main");
}
}