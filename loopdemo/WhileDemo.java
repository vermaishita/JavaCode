package loopdemo;

public class WhileDemo {
	int a=10;
	public void whileloop()
	{
		while(a<20) {
		System.out.println(a);
		a++;
		}
	}
	public static void main(String[] args) {
		WhileDemo dm= new WhileDemo();
		dm.whileloop();
	}
}
