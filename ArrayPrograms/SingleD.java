package ArrayPrograms;
import java.util.Scanner;

public class SingleD {
	//int[] rollno= {1,2,3,4,5};
	int[] rollno=new int[5];
	int counter,i;
	Scanner s=new Scanner(System.in);
	public void get()
	{
		//System.out.println(rollno[2]); //access array data
		for(i=0;i<rollno.length;i++)
		{
			rollno[i]=s.nextInt();
		}
		for(counter=0;counter<=rollno.length;counter++) {
			System.out.println(rollno[counter]);
		}		
	}
	public static void main(String[] args) {
		SingleD sd=new SingleD();
		sd.get();
	}
}
