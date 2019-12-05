package StringPrograms;
import java.util.Scanner;
public class BadWords
{
	String[] ar= {"stupid","rascal","nonsense"};
	//String sd;
	String st;
	public void acc()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		st=sc.nextLine();
		for(int i=0;i<ar.length;i++)
		{
			//sd=ar[i].toString();
			if(st.contains(ar[i]))
			{
				st=st.replaceAll(ar[i],"*****");
			}
		}
		System.out.println(st);
	}
	public static void main(String[] args) 
	{
		BadWords bw=new BadWords();
		bw.acc();
	}
}

