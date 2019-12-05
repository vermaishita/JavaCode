package OperatorDemo;

public class TernaryOperator {
	int a=10, b=20,res;
	public void tern()
	{
		res=(a>b)?a:b;
		System.out.println("Largest number is:" +res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TernaryOperator op=new TernaryOperator();
		op.tern();
	}

}
