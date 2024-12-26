package syed;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {

	public static void main(String[] args) {
		ArrayList al =new ArrayList();
		al.add(30);
		al.add(40);
		al.add(10);
		al.add(20);
		System.out.println("Before sorting:");
		for(int i=0;i<al.size();i++)
		{	
			System.out.println(al.get(i));
	
		}
		Collections.sort(al);
		System.out.println("after sorting:");
		for(int i=0;i<al.size();i++)
		{	
			System.out.println(al.get(i));
	
		}
		

		
	}

}
