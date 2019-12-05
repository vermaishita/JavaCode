package Exceptiondemo;
import java.util.Scanner;

public class BankAtm
{
	 int atmId;
	 static int choice;
	 static int balance=15000;
	 int value;
	 int add;
	 int draw;
	 String bankName,location;
	 static Scanner sc=new Scanner(System.in);
	 
	 public void deposit()
	 { 
		System.out.println("Enter the amount to deposit:");
		add=sc.nextInt();
		balance+=add;
		System.out.println("Available Balace is:"+balance);		
	 }	
	 public void withdraw() throws InvalidBalance,BankATMGreaterException
	 {
		 System.out.println("Enter the amount to withdraw:");
		 value=sc.nextInt();
		 draw=balance-value;
		 System.out.println("Left Over balance will be:"+draw);
		 
		 if(value<10000) 
		 {
			 System.out.println("Balance is:"+balance);
			 try
			 {
			 throw new InvalidBalance();	
			 }
			 catch (Exception e) {
				// TODO: handle exception
				 e.printStackTrace();
			}
		 }
		 
		 
		 else if(value>balance)
		 {
			 System.out.println("value is:"+value);
			 try {
				throw new BankATMGreaterException();
			} catch (BankATMGreaterException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }	 	 
	public static void main(String[] args) throws InvalidBalance,BankATMGreaterException
	{
		BankAtm ba=new BankAtm();
		//ba.deposit();
		//ba.withdraw();
		System.out.println("Available Balance is:"+balance);
		System.out.println("Enter Your choice:\nPress 1 to Deposit and Press 2 for Withdrawl:");
		choice=sc.nextInt();	
		 switch(choice) 
		 {
			 case 1:		 
			 ba.deposit();		 
			 break;
			 case 2:		 
			 ba.withdraw();	 
			 break;		 		 
		 	 default:
			 ba.withdraw();
		 }
	}
}
