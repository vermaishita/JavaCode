package OOPS;

public class GetEncapDemo {
	public void display()
	{
		StudentDemo oo= new StudentDemo();
		oo.setRollno(11);
		System.out.println(oo.getRollno());
	}
	public static void main(String[] args) {
	GetEncapDemo oo=new GetEncapDemo();
	oo.display();

	}

}
