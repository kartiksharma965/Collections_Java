package Practicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<String, LinkedHashMap<String,List<String>>> firm= new HashMap<String, LinkedHashMap<String,List<String>>>();
		
		LinkedHashMap<String,List<String>> Demate_account = new LinkedHashMap<String,List<String>>();
		List<String> Investment_Options = new ArrayList<String>();
		Investment_Options.add("Equity");
		Investment_Options.add("Gold");
		Investment_Options.add("Det fund");
		
		Demate_account.put("grow", Investment_Options);
		Demate_account.put("Zerodha", Investment_Options);
		Demate_account.put("Angle", Investment_Options);
		
		firm.put("Joshi Brokrage firm", Demate_account);
		firm.put("Sharma Brokrage firm", Demate_account);
		firm.put("Shrevastav Brokrage firm", Demate_account);
		
		System.out.println("Total size of HashMap(firm) : "+firm.size());
		System.out.println("All record/data of HashMap(firm) :"+firm);
		
		
		
		
		
		
		
		

	}

}
