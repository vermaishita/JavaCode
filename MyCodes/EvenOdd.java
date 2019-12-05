package MyCodes;
import java.util.Scanner;

public class EvenOdd 
{
	
	int num;
	Scanner sc;
	
	public void EvOdNumber()
	{
		System.out.println("Enter the number to check even or odd:");
		sc=new Scanner(System.in);
		num=sc.nextInt();
		{
		if(num%2==0)	
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd eo=new EvenOdd();
		eo.EvOdNumber();
	}
}
