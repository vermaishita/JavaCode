package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeCollection {
	int empid,salary;
	String empname,dob,grade;
	
	public void employee() {
		ArrayList<EmployeeInfo> ec=new ArrayList<EmployeeInfo>();
		ec.add(new EmployeeInfo(1, 30000,"A","Pooja","Feb 01 93"));	
		ec.add(new EmployeeInfo(2, 40000,"A","Pooja","Feb 08 93"));
		System.out.println(ec.remove(0)); //uncomment this to remove a[1];
		//Iterator oo=ec.iterator();
		for(EmployeeInfo e:ec) 
		{
			System.out.println("Employee ID is:"+e.empid);
			System.out.println("Employee Name is:"+e.empname);
			System.out.println("Employee Grade is:"+e.grade);
			System.out.println("Employee Salary is:"+e.salary);
			System.out.println("Date Of Birth is:"+e.dob);		
	}
	}	
	public static void main(String[] args) 
	{
		EmployeeCollection ec= new EmployeeCollection();
		ec.employee();
	}
}
