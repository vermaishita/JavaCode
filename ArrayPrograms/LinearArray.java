package ArrayPrograms;
import java.util.Scanner;
public class LinearArray 
{
	int arr[]=new int[100],n,i,s;
	Scanner sc=new Scanner(System.in);
	public void linear() 
	{
		System.out.println("Enter the number of elements=");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the elements of an array=");
			arr[i]=sc.nextInt();		
		}
		//System.out.println(arr);
		System.out.println("Enter the element to be searched=");
		s=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]==s)
			{
				System.out.println(s+" "+ "Element found at index position"+ " "+i);
				break;
			}
		}
		if(i==n)
		{
			System.out.println("Element not found");
		}
}
	public static void main(String[] args) 
	{
		LinearArray la=new LinearArray();
		la.linear();
	}
}
