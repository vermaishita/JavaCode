package ConditionalDemo;
public class DoWhileDemo {
	
	int num=1;
	public void acc()
	{
		do 
		{
			System.out.println(num);
			num++;
		} while(num<1);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoWhileDemo dm=new DoWhileDemo();
		dm.acc();
	}
}
