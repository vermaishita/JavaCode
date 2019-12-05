package loopdemo;
import java.util.Scanner;
public class LoopTest 
{
	int num,i=1,res;
	char choice;
	Scanner sc= new Scanner(System.in);
	
	public void number() 
	{	
		do
		{	
			System.out.println("Enter the number:");
			num=sc.nextInt();
			for(int i=1;i<=10;i++)
			{
				System.out.println(num+"*"+i+"="+num*i);
				
			} System.out.println(num);
			System.out.println("Do you want to continue? (Y/N):");
			choice=sc.next().charAt(0);
		}
		while(choice=='Y');			
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopTest lp=new LoopTest();
		lp.number();
	}
}
