package MyCodes;

import java.util.Scanner;

public class Prime {
	int num,i,m;
	Scanner sc;
	public void PrimeNumber() {
		System.out.println("Enter the number to check Prime or Not=");
		sc=new Scanner(System.in);
		num=sc.nextInt();
		if((num==0)||(num==1)) 
		{
			System.out.println("Entered number is Not a Prime Number");
		}
		else
		{
			for(i=2;i<=num;i++) 
			{
				if(num%i==0) 
				{
					System.out.println("Not a Prime Number");
				}
			}
		} 		
	}
	public static void main(String[] args) {
		PrimeNo pn=new PrimeNo();
		pn.PrimeNumber();
	}

}
