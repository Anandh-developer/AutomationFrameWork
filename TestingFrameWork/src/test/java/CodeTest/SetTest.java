package CodeTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
	Set<String> test= new HashSet<>();
	test.add("Anandh");
	test.add("Kumar");
	Iterator<String> iter=test.iterator();
	while(iter.hasNext())
	{
	
		System.out.println(iter.hasNext());
		System.out.println(test.size());
		System.out.println(iter.next());
		
	}
	while(iter.hasNext())
	{
		
		
		
		System.out.println(iter.next());
	}

	}

}
