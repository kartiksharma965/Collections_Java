package List;

import java.util.ArrayList;
import java.util.List;


/*     Rule = In collection we can not work with primitive data type
		    = We can not supply argument as int etc.
		    = We can only work with object.
	   Note = Hence we have to specify class name. 

       Rule = If fixed 'data type' is not specified then compile time error is displayed 
	          for entire ArrayList.
	          
	   Rule = removeAll() method we can remove all matching data.
**/
public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Rule = If fixed 'data type' is not specified then compile time error is displayed 
		//        for entire ArrayList.
		System.out.println("*** Scenario 1 : Data type not specified ***");
		List a = new ArrayList<>();
		a.add(9);
		a.add(9.9);
		a.add(5);
		a.add('r');
		a.add("rest assured");
		a.add(true);
		System.out.println("Total size of ArrayList (Data type not specified) :"+a.size());
		System.out.println("All records of ArrayList (Data type not specified) :"+a);
		System.out.println("*** Scenario 1 : ends ***");

		/** Rule = In collection we can not work with primitive data type
		         = We can not supply argument as int etc.
		         = We can only work with object.
		    Note = Hence we have to specify class name. */

		System.out.println("*** Scenario 2 : Integer Data type ***");

		List<Integer> b = new ArrayList<Integer>();
		b.add(5);
		b.add(25);
		b.add(625);
		/** If we try to add record other than integer then as result compile time error. 
		 * b.add('r'); b.add("rest"); b.add('r'); b.add(true); */
		System.out.println("Total size of ArrayList (Integer data type) :"+b.size());
		System.out.println("All records of ArrayList (Integer data type) :"+b);
		System.out.println("*** Scenario 2 : ends ***");

		System.out.println("*** Scenario 3 : Character data type ***");

		List<Character> c = new ArrayList<Character>();
		c.add('r');
		c.add('a');
		c.add('m');
		/** If we try to add record other than character then as result compile time error. 
		 * c.add(123); c.add("rest"); c.add('r'); c.add(true); */
		System.out.println("Total size of ArrayList (Character data type) :"+c.size());
		System.out.println("All records of ArrayList (Character data type) :"+c);
		System.out.println("*** Scenario 3 : ends ***");

		System.out.println("*** Scenario 4 : removeall() method ***");
		System.out.println("All records of ArrayList (a) :"+a);
		System.out.println("All records of ArrayList (b) :"+b);
		System.out.println("All records of ArrayList (c) :"+c);
		//Rule = removeAll() method we can remove all matching data.
		a.removeAll(b);
		System.out.println("Arraylist a after removing matching data from b :"+a);
		a.removeAll(c);
		System.out.println("ArrayList a after removing matching data from c :"+a);
		System.out.println("*** Scenario 4 : ends ***");
	}
}
