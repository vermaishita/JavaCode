package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrograms 
{
	public void accept()
	{
		//ArrayList al=new ArrayList();// Non Generic
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(123);
		al.add("Ishita Verma");
		al.add("SDET");
		al.add("RC0988G628");
		System.out.println(al);
		System.out.println(al.size());
		//System.out.println(al.get(2));
		//System.out.println(al.remove(1));
		//al.remove(2);
		System.out.println("New Array List is"+al);
		Iterator ii=al.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
		}	
		ii.remove();
		//System.out.println("------------"ii.next());
		System.out.println("New size of the list is:"+al.size());
	}
	public static void main(String[] args) 
	{
		ArrayListPrograms ap=new ArrayListPrograms();
		ap.accept();
	}

}
