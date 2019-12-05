package MyCodes;
import java.util.Scanner;

public class PrimeNo {
	
	int num,i,m;
	Scanner sc;

	public void PrimeNumber()
	{
		System.out.println("Enter the number to check Prime or Not=");
		sc=new Scanner(System.in);
		num=sc.nextInt();
		if((num==0)||(num==1)) 
		{
			System.out.println("Entered number is Not a Prime Number");
		}
		else
		{
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNo pn=new PrimeNo();
		pn.PrimeNumber();

	}
}
