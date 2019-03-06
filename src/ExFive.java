public class ExFive
{
public static void main(String args[])
{
	int x=0, y=0, z=0;

	try
	{
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);

	if(y>x)
	{
	LargeNoException ob=new LargeNoException();
	//ArithmeticException ob=new ArithmeticException();
	throw ob;

	}

	z=x/y;
	}
	catch(ArithmeticException e)
	{
		System.out.println("ArithmeticException Handled");
		z=x/2;
	}
	catch(LargeNoException e)
	{
		System.out.println("LargeNoException Handled");
	}
	System.out.println("Result : "+z);
	System.out.println("End-of-main");

}
}