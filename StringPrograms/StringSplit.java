package StringPrograms;
public class StringSplit 
{
	String str="Ishita Verma";
	String[] arr;
	String st;
	public void acc()
	{
		arr=str.split(" ");
		System.out.println(arr[1]);
	}	
	public static void main(String[] args) 
	{
		StringSplit ss=new StringSplit();
		ss.acc();
	}
}
