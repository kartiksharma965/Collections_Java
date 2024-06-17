package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Linked Hashmap
 *  Rule = Linked HashMAP it maintain insertion order of record/data.
 *       = Rest all is same as HashMap collection.
 */

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*** Scenario 1 : HashMap ***");
		// Rule = HashMap insertion order is not maintained.
		Map a =new HashMap<>();
		a.put("1", "test1");
		a.put("2", "test2");
		a.put(4, "Integer 4");
		a.put('c', 'k');
		a.put("3", "test3");
		a.put("sham", "ram");
		System.out.println("Total size of HashMap(a) :"+a.size());
		System.out.println("All records/data of HashMap(a) :"+a);
		System.out.println("*** Scenario 1 ends ***");
		
		
		System.out.println("*** Scenario 2 : LinkedHashMap ***");
		// Rule = LinkedHashMap insertion order is maintained
		
		Map b = new LinkedHashMap<>();
		b.put("1", "test1");
		b.put("2", "test2");
		b.put(4, "Integer 4");
		b.put('c', 'k');
		b.put("3", "test3");
		b.put("sham", "ram");
		System.out.println("Total size of LinkedHashMap(b) :"+b.size());
		System.out.println("All records/data of LinkedHashMap(b) :"+b);
		System.out.println("*** Scenario 2 ends ***");
		

	}

}
