package ArrayPrograms;

public class LinearSearchArray {
	public static void main(String[] args) {
	int linear[]= {10,20,45,23,67,89,56,67};
	int size= linear.length;
	int value= 0;	
		for(int i=1;i<size;i++)
		{
			if(linear[i]==value)
			{
				System.out.println("Element found on array index"+ " " + i);
			}else
				System.out.println("Element is not the chosen array");	
			break;
		}	
			
	}
}

