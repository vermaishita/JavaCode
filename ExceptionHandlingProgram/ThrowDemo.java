package ExceptionHandlingProgram;
import java.util.Scanner;
public class ThrowDemo {
	int rollno,age;
	String Name;
	Scanner sc=new Scanner(System.in);
	public void accept()
	{
		System.out.println("Enter Rollno");
		rollno=sc.nextInt();
		
		System.out.println("Enter Name");
		Name=sc.next();
		
		System.out.println("Enter age");
		age=sc.nextInt();
		
		if(age>18)
		{
			try {
			throw new InvalidAgeException();
			}catch(InvalidAgeException e) {
				e.printStackTrace();
			}
		}		
	}
	public static void main(String[] args) 
	{
		ThrowDemo td=new ThrowDemo();
		td.accept();

	}
}
