package concurrentthread;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWArrayListEx {
	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		a1.add("Shubham");
		a1.add(15313);
		System.out.println(a1);
		
		CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<String>();
	
		cowal.add("Shubham");
		cowal.add("Raghav");
		cowal.add("Pankaj");
		cowal.add("Mr. X");
		cowal.addAllAbsent(a1);
		System.out.println(cowal);
	}
}

