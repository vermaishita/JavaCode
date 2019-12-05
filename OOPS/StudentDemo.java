package OOPS;
public class StudentDemo {
	private int rollno,marks;
	private String name;
	public int getRollno() { //Read only property//getter property/method
		return rollno;
	}
	public void setRollno(int rollno) { //write only property
		this.rollno = rollno;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
