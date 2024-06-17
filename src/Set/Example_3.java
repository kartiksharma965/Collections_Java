package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/** Treeset 
 * Rule = Adding duplicate records are not allowed.
 *      = It will keep record/data in default sorting order (Ascending order).
 *      = It will not maintain insertion order.*/

public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> set = new TreeSet <String> ();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		// duplicate record
		set.add("one");
		set.add("two");
		set.add("three");
		
		System.out.println("Total size of TreeSet(set) :"+set.size());
		System.out.println("All records of TreeSet(set) :"+set);
		
		System.out.println("*** Scenario 1 : Iterator ***");
		Iterator itr= set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*** Sceanrio 1 ends ***");
	}

}
