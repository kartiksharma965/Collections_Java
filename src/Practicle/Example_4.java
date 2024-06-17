package Practicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<List<String>, LinkedHashMap<String,List<String>>> firm= new HashMap<List<String>, LinkedHashMap<String,List<String>>>();

		List<String> Customer= new ArrayList<String>();
		LinkedHashMap<String,List<String>> Demate_Account = new LinkedHashMap<String,List<String>>();
		List<String> Investment_Options = new ArrayList<String>();
		Investment_Options.add("Equity");
		Investment_Options.add("Bonds");
		Investment_Options.add("Commodity");
		
		Demate_Account.put("Angle brokrage", Investment_Options);
		Demate_Account.put("Zerodha", Investment_Options);
		Demate_Account.put("Grow", Investment_Options);
		
		Customer.add("A catagory customer");
		Customer.add("B catagory customer");
		Customer.add("C catagory customer");
		
		firm.put(Customer, Demate_Account);
		
		System.out.println("Total size of firm : "+firm.size());
		System.out.println("All records/data of firm : "+firm);
	}

}
