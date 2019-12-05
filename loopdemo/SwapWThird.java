package loopdemo;
import java.util.Scanner;

public class SwapWThird {
	
	int n1=10,n2=20;
	Scanner sc;
	
	public void SwapW()
	{
		/*System.out.println("Enter the First Number:");
		sc= new Scanner(System.in);
		n1=sc.nextInt();
		System.out.println("Enter the Second Number:");
		sc= new Scanner(System.in);
		n2=sc.nextInt(); */
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		;
		//n2=n2-n1;
		System.out.println(n1);
		System.out.println(n2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapWThird sw=new SwapWThird();
		sw.SwapW();

	}

}
