package MyCodes;
import java.util.Scanner;

public class Addition {
	int num1,num2,res;
	Scanner sc;
	
	public void add() 
	{
		while(1>0) 
		{
		System.out.println("Enter the Number One:");
		sc=new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter the Number Two:");
		sc=new Scanner(System.in);
		num2=sc.nextInt();
		res=num1+num2;
		System.out.println("Addition of the numbers is:" +res);		
		}
	}

	public static void main(String[] args) {
		Addition ad=new Addition();
		ad.add();
	}

}
