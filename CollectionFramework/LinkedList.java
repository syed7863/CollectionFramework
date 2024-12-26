package syed;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		List ll = new LinkedList();
		ll.add(10);
		ll.add("java");
		ll.add(45.5);
		
		System.out.println(ll);
		for(int i=0; i<ll.size();i++)
		{
			System.out.println(ll.get(i));
			
			
		}
		System.out.println(ll.size());
		
		System.out.println(ll);
		ll.add(1, 50);
		System.out.println(ll);
		ll.set(2, 70);

	}

}
