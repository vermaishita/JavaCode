package StringPrograms;
import java.util.Scanner;
public class StringVowels 
{
	String sen;
	char ch;
	int i=0,j;
	public void Vowels()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String to display the vowels:-");
		sen=sc.nextLine();
		System.out.println("The vowels in the String are");
		
		for(j=0;j<sen.length();j++)
		{
			ch=sen.charAt(j);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			/*ch=sen.charAt(j);
			switch(ch)
			{
			case'a':
			case'A':
			case'e':
			case'E':
			case'i':
			case'I':
			case'o':
			case'O':
			case'u':
			case'U':*/
			//i=1;
			System.out.println(ch);	 
		}
	/*if(i==0)
	{
		System.out.println("No vowels in the String");
	}*/
	} 

	public static void main(String[] args) 
	{
		StringVowels sv= new StringVowels();
		sv.Vowels();
	}
}
