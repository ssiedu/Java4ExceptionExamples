public class ExFour
{
public static void main(String args[])
{
	int x=0, y=0, z=0;

	try
	{
	x=Integer.parseInt(args[0]);
	y=Integer.parseInt(args[1]);
	z=x/y;
	}
	catch(ArithmeticException e)
	{
		z=x/Integer.parseInt(args[2]);
	}
	finally
	{
		System.out.println("From Finally. Always Run");
	}	

	System.out.println("Result : "+z);
	System.out.println("End-of-main");

}
}