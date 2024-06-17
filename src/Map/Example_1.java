package Map;

import java.util.HashMap;
import java.util.Map;
/** Rule 
  = It contains value based on key.
  = It implements MAP interface.
  = It contains only unique element.
  = It may have only one null key and multiple null values.
  = Adding duplicate value are not allowed.
  = Insertion order is not maintained. 
  */

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> hm= new HashMap<Integer,String>();
		hm.put(1, "test1");
		hm.put(2, "test2");
		/** Rule = Hashkey value (1,2) are not overridden once declared/
		 *       = Value once declared (test1, test2) can be successfully overridden with (test3, test4)
	    */
		hm.put(1, "test3");
		hm.put(2, "test4");
		System.out.println("Total size of HashMap(hm) :"+hm.size());
		System.out.println("All records of HashMap(hm) :"+hm);
		System.out.println("1st index in HashMap(hm) :"+hm.get(1));
		System.out.println("2nd index in HashMap(hm) :"+hm.get(2));

	}

}
