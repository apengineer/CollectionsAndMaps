package collectionsAndMaps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
	
	public void demoLinkedLists() {
		List<String> myll = new LinkedList<String>();
		
	}
	
	public void demoQueues() {
		Queue<String> myQ = new PriorityQueue<String>();
		myQ.add("First Person");
		myQ.add("Second Person");
		myQ.add("Third Person");
		myQ.add("Third Person"); // duplicate value permitted
		
		Iterator<String> it = myQ.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Head of queue: " + myQ.peek()); // check head
		System.out.println("Removing person out of queue: "+ myQ.poll()); // check and remove head
		System.out.println("Queue after processing-----");
		it = myQ.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}			
	}	
	
	// Collection of unique elements.  not indexed, no get(i) method for XXXSet classes
	public void demoSet() {		
		
		System.out.println("**************************************************");
		System.out.println("Use Set for holding unique collection of elements");
		System.out.println("**************************************************");
		//For HashSet : No guarentee for order of storage,
		Set<String> mySet = new HashSet<String>();
		mySet.add("J of Spades");
		mySet.add("9 of Clubs");
		mySet.add("9 of Clubs");  // duplicate value
		mySet.add("5 of Diamond");
		System.out.println("** HashSet doesn't guarnatee any order of storage");
		Iterator<String> it = mySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); // 9 of clubs would be printed only once.
		}	
		
		//LinkedHashSet: Order of insertion preserved
		Set<String> myLHSet = new LinkedHashSet<String>();
		myLHSet.add("King of Spades");
		myLHSet.add("Queen of Spades");
		myLHSet.add("Jack of Spades");		
		myLHSet.add("10 of Spades");
		
		
		System.out.println("** LinkedHashSet guarantees order of insertion while retrieving");
		Iterator<String> myLHIt=  myLHSet.iterator();
		while(myLHIt.hasNext()) {		
			System.out.println(myLHIt.next());
		}
		
		
		// TreeSet members are sorted in ascending order. Hence faster for searching
		Set<String> myTreeSet = new TreeSet<String>();
		myTreeSet.add("B");
		myTreeSet.add("A");
		myTreeSet.add("Z");
		System.out.println("** TreeSet elements are stored in ascending order");
		Iterator<String> myTIt=  myTreeSet.iterator();
		while(myTIt.hasNext()) {		
			System.out.println(myTIt.next());
		}
				
	}
	
	public static void main(String [] args) {
		Collections myCol = new Collections();
		//myCol.demoQueues();
		myCol.demoSet();
	}

}

