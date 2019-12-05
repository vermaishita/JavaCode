package MyCodes;
import java.util.Scanner;

public class ProgramTen {

	int n=0,m=0;
	Scanner sc;
	public void Printx() {
		System.out.println("Enter the Staritng Number:");
		sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the Ending Number:");
		sc=new Scanner(System.in);
		m=sc.nextInt();
		for(;n>=m;n--) 
		{
		System.out.println("The number is =" +n);
		}
		for(int g=m-1;g>=1;g--) 
		{
			System.out.println(g);
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramTen pt=new ProgramTen();
		pt.Printx();	
	}
}
