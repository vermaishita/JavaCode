package Inheritance;

public class Deer extends AnimalDemo{
	public static void main(String[] args) 
	{
		Deer de= new Deer();
		de.eat();
		
	}
void eat() 
{
	System.out.println("Deer eats Veg food");
	drink();
	a=100;
	System.out.println(a);
}
}
