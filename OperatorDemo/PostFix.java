package OperatorDemo;

public class PostFix {
	int a=10,b;
	public void postop()
	{
		b=a++;
		System.out.println("a is:" +a);
		System.out.println("b is:" +b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostFix oo=new PostFix();
		oo.postop();

	}

}
