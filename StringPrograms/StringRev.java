package StringPrograms;
public class StringRev 
{
	String rev;
	public void reverse()
	{
		StringBuffer rev=new StringBuffer("Keyboard");
		rev.reverse();
		System.out.println(rev);		
	}	
	public static void main(String[] args) 
	{
		StringRev sr=new StringRev();
		sr.reverse();
	}
}
