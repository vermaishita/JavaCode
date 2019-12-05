package Inheritance;
public class StudentMarksDet extends StudentPersonalDetails 
{
	int hindi, maths;
	public void acc()
	{
		accept();
		display();
		System.out.println("Enter marks in Hindi:");
		hindi=sc.nextInt();
		System.out.println("Enter marks in Maths:");
		maths=sc.nextInt();
	}
	public static void main(String[] args) 
	{
		StudentMarksDet oo=new StudentMarksDet();
		oo.acc();
	}
}
