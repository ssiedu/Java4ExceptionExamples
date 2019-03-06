import java.io.*;

public class ExSeven
{
public static void main(String args[]) throws FileNotFoundException, IOException
{

if(args.length==1)
{
	String fname=args[0];
	FileInputStream fis=new FileInputStream(fname);
	System.out.println("File Successfully Opened");
	fis.read();
}
else
{
	System.out.println("Please Pass File Name");
}

}
}
/*
	Checked Vs Unchecked Exception
	------------------------------
	
*/