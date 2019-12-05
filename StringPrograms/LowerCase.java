package StringPrograms;
public class LowerCase 
{
	String st;
	public void Lower()
	{
		st="HI,THIS IS A STRING PROGRAM FOR LOWER CASE :)";
		System.out.println(st.toLowerCase());
	}
	public static void main(String[] args) 
	{
		LowerCase lc=new LowerCase();
		lc.Lower();
	}
}
