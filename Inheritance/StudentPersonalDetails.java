package Inheritance;
import java.util.Scanner;
public class StudentPersonalDetails 
{
	int Rollno,contactno;
	String Name;
	Scanner sc=new Scanner(System.in);
	public void accept() 
	{
		System.out.println("Enter Roll No");
		Rollno=sc.nextInt();
		System.out.println("Enter name");
		Name=sc.next();
		System.out.println("Enter contact no");
		contactno=sc.nextInt();
	}
	public void display()
	{
		System.out.println("Roll No is:"+Rollno);
		System.out.println("Name is:"+Name);
		System.out.println("Contact no is:"+contactno);
	}
	public static void main(String[] args) 
	{
		StudentPersonalDetails st=new StudentPersonalDetails();
		st.accept();
		st.display();
	}
}
