package ConditionalDemo;

public class NestedIf {
	int num1=10,num2=20,num3=30;
	public void CheckGreater()
	{
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("Num1 is greater=" +num1);
			}
		}
		else if((num2>num1)&&(num2>num3))
		{
			System.out.println("Num2 is greater=" +num2);
		}
		else
		{
			System.out.println("Num3 is greater=" +num3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedIf no=new NestedIf();
		no.CheckGreater();

	}
}
