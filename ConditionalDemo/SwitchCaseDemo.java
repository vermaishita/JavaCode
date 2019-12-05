package ConditionalDemo;
import java.util.Scanner;
public class SwitchCaseDemo 
{
	int num1,num2,res,choice;
	Scanner sc;
	public void chooseChoice()
	{
		System.out.println("1.Add\t\t2.Subtract\n3.Multiply\t4.Divide");
		System.out.println("Enter your choice:");
		sc=new Scanner(System.in);
		choice=sc.nextInt();
	
		System.out.println("Enter the First number:");
		num1=sc.nextInt();
		System.out.println("Enter the Second number:");
		num2=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			res=num1+num2;
			System.out.println("Result of Addition is:" +res);
			break;
		case 2:
			res= num1-num2;
			System.out.println("Result of Subrction is:" +res);
			break;
		case 3:
			res= num1*num2;
			System.out.println("Result of Multiplicaton is:" +res);
			break;
		case 4:
			res= num1/num2;
			System.out.println("Result of Division is:" +res);
			break;
		//default case
		default :System.out.println("Please enter correct choice");
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SwitchCaseDemo sd=new SwitchCaseDemo();
		sd.chooseChoice();
	}
	}


