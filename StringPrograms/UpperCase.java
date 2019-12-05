package StringPrograms;
public class UpperCase 
{
	String str;
	public void upper()
	{
		str="hello";
		System.out.println(str.toUpperCase());
	}
	public static void main(String[] args) 
	{
		UpperCase uc=new UpperCase();
		uc.upper();
	}
}
