package loopdemo;
import java.util.Scanner;

public class Fibonacci {
	int n1=0,n2=1,n3,i,n;
	Scanner sc=new Scanner(System.in);
	 public void FibSeries() {
		 System.out.println("How many numbers to print?");
		 n=sc.nextInt();
		 System.out.println(n1+" "+n2);
		 for(i=2;i<=n;++i) {
		 n3=n1+n2;
		 System.out.println(" "+n3);
		 n1=n2;
		 n2=n3;
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fb= new Fibonacci();
		fb.FibSeries();
	}
}
