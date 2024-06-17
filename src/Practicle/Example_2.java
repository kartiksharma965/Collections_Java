package Practicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, List<String>> Demate_account=new HashMap<String, List<String>>();
		
		List<String> Investment_Options = new ArrayList<String>();
		Investment_Options.add("equity");
		Investment_Options.add("Gold");
		Investment_Options.add("Mutual fund Indirect");
		Investment_Options.add("Mutual fund direct");
		Investment_Options.add("Index fund");
		Investment_Options.add("Commodity");
		Investment_Options.add("Real estate");
		Investment_Options.add("Corporate bond");
		Investment_Options.add("Personal Provident Fund");
		
		Demate_account.put("Grow", Investment_Options);
		Demate_account.put("Zerodha", Investment_Options);
		Demate_account.put("Angle", Investment_Options);
		
		System.out.println("Total Size of HashMap(firm) :"+Demate_account.size());
		System.out.println("All records of HashMap(firm) :"+Demate_account);
		
		
		
		
	}

}
