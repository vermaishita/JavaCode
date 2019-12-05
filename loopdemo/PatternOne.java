package loopdemo;
import java.util.Scanner;
public class PatternOne {
	
	int i,j,n;
	Scanner sc=new Scanner(System.in);
	public void pattern() 
	{
		System.out.println("How many lines to print?");
		n=sc.nextInt();
		for(i=0;i<n;i++) 	
		{
			//System.out.println("okay");
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		PatternOne po=new PatternOne();
		po.pattern();
	}

}
