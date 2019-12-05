package Inheritance;

import java.util.Scanner;

public class StudentDemo implements IntPerdet,IntMarksDet{
	int rollno,contactno;
	String name;
	Scanner sc=new Scanner(System.in);

	@Override
	public void perdet() {
		// TODO Auto-generated method stub
		System.out.println("Enter Roll No:");
		rollno=sc.nextInt();
		System.out.println("Enter contact No:");
		contactno=sc.nextInt();
		System.out.println("Enter name:");
		name=sc.next();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Rollno is" +rollno);
		System.out.println("contactno is" +contactno);
		System.out.println("name is" +name);
	}
	@Override
	public void marksdet() {
		// TODO Auto-generated method stub
		StudentDemo sd=new StudentDemo();
		sd.perdet();
		sd.display();		
	}
}
