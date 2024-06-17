package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** Hashset
 * Rule = Insertion/Sorting order is not maintained.
 *      = Adding Duplicate values are not allowed. 
 *      = Set collection does not have get() method to access individual items.
 *        It does not have indexing concept.*/

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		// duplicate
		set.add("one");
		set.add("two");
		
		System.out.println("Total size of hashset(set) :"+set.size());
		System.out.println("All records of hashset(set) :"+set);
		
		System.out.println("*** Scenario 1: Iterator ***");
		Iterator  itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*** Scenario 1 : end ***");
	 
	}

}
