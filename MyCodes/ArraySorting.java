package MyCodes;
import java.util.Arrays;

public class ArraySorting 
{
	public static void main(String[] args) 
	{
		int [] arr= {3,6,7,4,67,8,9,3,3,4,5,10};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
