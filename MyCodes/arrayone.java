package MyCodes;
import java.util.Scanner;
public class arrayone 
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{		
		int age[]= {10,20,30,40,50};
		for(int i=0;i<5;i++)
		{
			System.out.println("Element at index"+" "+ i +":" + age[i]);
		}	
	}
}
