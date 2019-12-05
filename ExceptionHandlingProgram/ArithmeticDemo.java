package ExceptionHandlingProgram;
import java.util.Scanner;

public class ArithmeticDemo {
	int num1,num2,res;
	Scanner sc=new Scanner(System.in);
	public void division() 
	{
		try 
		{
		System.out.println("Enter the value of num1=");
		num1=sc.nextInt();
		System.out.println("Enter the value of num2=");
		num2=sc.nextInt();	
		res=num1/num2;
		System.out.println("Result is=" +res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter another value for num2 except 0");
			num2=sc.nextInt();
			res=num1/num2;
			System.out.println("Result is=" +res);
		}
		catch(NullPointerException e2) 
		{
			System.out.println("Null pointer exception");
		}
		catch(ArrayIndexOutOfBoundsException e1) 
		{
			System.out.println("Error");
		}
		catch(Exception ee) 
		{
			//System.out.println("Input the valid value");
			ee.printStackTrace(); //it will display the top exception message in the stack
		}
		finally
		{
			System.out.println("Hi..this is finally block");
		}
	}	
	public static void main(String[] args) {
		ArithmeticDemo ad=new ArithmeticDemo();
		ad.division();
	}
}
