package MyCodes;

public class StarCode{
int i, j, k;
public void StarP() 
{
for(i=5;i>=1;i--)
{
	for(j=1;j<i;j++)
	{
		System.out.print(" ");
	}
		for(k=5;k>=i;k--)
		{
			System.out.print("*");
		}
			System.out.println();
}
}
	public static void main(String[] args) 
	{
		StarCode sc=new StarCode();
		sc.StarP();
	}
}
