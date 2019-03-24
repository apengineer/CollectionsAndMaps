package collectionsAndMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Maps {
	
	// Map class is not indexed, hence no get(index) method. However, can access by get(Key)
	public void demoMapClasses() {
		System.out.println("Map holds unique keys, can have duplicate values");
		
		System.out.println("*****************************");
		System.out.println("HashMap doesn't guarentee any order of storage");
		
		
		Map<Integer, String> myHashMap = new HashMap<Integer, String>();
		myHashMap.put(10, "DE");
		myHashMap.put(3, "PL");
		myHashMap.put(3,"EN"); // value will be overwritten
		myHashMap.put(1, "CZ");		
		
				
		
		Set<Entry<Integer, String>>myEntrySet = myHashMap.entrySet();		
		Iterator<Entry<Integer, String>> myEntrySetIt = myEntrySet.iterator();
		
		while(myEntrySetIt.hasNext()) {
			Entry<Integer, String> entry = myEntrySetIt.next();
			System.out.println("Key :" + entry.getKey() + " Value: " + entry.getValue());
		}
		
		
		System.out.println("LinkedHashMap preserves order of insertion");
		Map<Integer, String> myLLHashMap = new LinkedHashMap<Integer, String>();
		myLLHashMap.put(1, "DE");
		myLLHashMap.put(3, "PL");
		myLLHashMap.put(2, "CZ");		
				
		
		myEntrySet = myLLHashMap.entrySet();		
		myEntrySetIt = myEntrySet.iterator();
		
		while(myEntrySetIt.hasNext()) {
			Entry<Integer, String> entry = myEntrySetIt.next();
			System.out.println("Key :" + entry.getKey() + " Value: " + entry.getValue());
		}
		
		System.out.println("TreeMap orders elements based on key values ascendingly");
		Map<String, String> myTreeMap = new TreeMap<String, String>();
		myTreeMap.put("Z", "DE");
		myTreeMap.put("A", "PL");
		myTreeMap.put("B", "CZ");		
				
			
		Set<Entry<String, String>>myEntrySet1 = myTreeMap.entrySet();	
		Iterator<Entry<String, String>>it = myEntrySet1.iterator();
			
		while(it.hasNext()) {
			Entry<String, String> entry = it.next();
			System.out.println("Key :" + entry.getKey() + " Value: " + entry.getValue());
		}	
		
	}

	public static void main(String[] args) {
		Maps maps = new Maps();
		maps.demoMapClasses();

	}

}
