package Collections;

import java.util.ArrayList;
public class StudentArrayList {
	public void accept() {
		ArrayList<StudentDemo> al=new ArrayList<StudentDemo>();
		al.add(new StudentDemo(1, "Pooja"));
		al.add(new StudentDemo(2, "Manisha"));
		al.add(new StudentDemo(3, "Ishita"));
		al.add(new StudentDemo(4, "Balraj"));
		al.add(new StudentDemo(5, "Arun"));
		for(StudentDemo s:al) 
		{
			System.out.println("Rollno is:"+s.rollno+"Name:"+s.name);
		}
	}
	public static void main(String[] args) {
		StudentArrayList sa=new StudentArrayList();
		sa.accept();
	}
}
