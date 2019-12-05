package ConditionalDemo;
import java.util.Scanner;

public class forLoop {
	int num;
	public void acc() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for which table is to be printed:");
		num=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"=" +num*i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forLoop lo=new forLoop();
		lo.acc();
	}

}
