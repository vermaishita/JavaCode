package loopdemo;
import java.util.Scanner;
public class SwapNumbers {

	int num1,num2,num3;
	Scanner sc;
	public void SwapNum()
	{
		System.out.println("Enter the First Number:");
		sc= new Scanner(System.in);
		num1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		sc= new Scanner(System.in);
		num2=sc.nextInt();		
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("Swapped Numbers are:-");
		System.out.println(" First Numbers:" +num1);
		System.out.println(" Second Numbers:" +num2);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumbers sw=new SwapNumbers();
		sw.SwapNum();

	}

}
