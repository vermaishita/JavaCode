package loopdemo;
import java.util.Scanner;
public class Factorial {
	int num,fc=1,i;
	Scanner sc=new Scanner(System.in);
	public void Fact() {
	
		System.out.println("Enter the number to calculate the Factorial=");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		fc=fc*i;
		System.out.println("Factorial is=" +fc);		
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fc=new Factorial();
		fc.Fact();
	}		
}
