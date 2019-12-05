package ArrayPrograms;
import java.util.Scanner;
public class TwoDarray 
{
	public static void main(String[] args) 
{
	int arr [][]= new int [3][2];
	Scanner s= new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{		
		System.out.println("Enter the elements=");
		arr[i][j]=s.nextInt();
	}
}
	int max=arr[0][0];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]>max)
			{
				max=arr[i][j];
			}				
		}
	}
	System.out.print(max);		
}
}
