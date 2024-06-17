package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/** Linked Hashset
 
 *  Rule = Adding Duplicate values are not allowed.
 *       = Insertion order is maintained in Linked Hashset.
 *       */

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set = new LinkedHashSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		// adding duplicate values are not allowed.
		set.add("one");
		set.add("two");
		set.add("three");
		
		System.out.println("Total size of LinkedHashSet(set) :"+set.size());
		System.out.println("All records of LinkedHashSet(set) :"+set);
		
		System.out.println("*** Scenario 1:  Iterator ***");
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("*** Scenario 1 end ***");
	}

}
