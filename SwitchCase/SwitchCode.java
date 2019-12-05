package SwitchCase;
import java.util.Scanner;

public class SwitchCode {

	int ch1,ch2,choice,cho,si,qt,tp,p=1000;
	Scanner sc;
	public void selectChoice()
	{
		System.out.println("1.Pizza\t\t2.French Fries");
		System.out.println("Enter your choice:");
		sc=new Scanner(System.in);
		choice=sc.nextInt();
		System.out.println("Enter the flavour:");
		System.out.println("1.Cheese Capsicum\t2.Corns\t\t3.Farm House");
		sc=new Scanner(System.in);
		cho=sc.nextInt();
		System.out.println("Enter the Size:");
		System.out.println("1.Large\t\t2.Medium\t3.Small");
		sc=new Scanner(System.in);
		si=sc.nextInt();
		System.out.println("Enter the Quantity:");
		sc=new Scanner(System.in);
		qt=sc.nextInt();
		tp=p*qt;
		System.out.println("Please pay:" +tp);	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchCode sw=new SwitchCode();
		sw.selectChoice();		
	}
}
