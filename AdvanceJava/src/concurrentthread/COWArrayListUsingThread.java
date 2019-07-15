package concurrentthread;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWArrayListUsingThread {
static CopyOnWriteArrayList<String> copyArray = new CopyOnWriteArrayList<String>();
	
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("I got it!! ~ Beta");
		System.out.println("Welcome to Capgemini!!");
		copyArray.add("Pitaji");
		copyArray.clear();
	}
	
	public static void main(String[] args) throws InterruptedException {
		copyArray.add("Shubham");
		copyArray.add("Atom");
		copyArray.add("Pankaj");
		copyArray.add("Sanskar");
		
		ConcurrentHashMapEx2 chm = new ConcurrentHashMapEx2();
		chm.start();
		
		
		Iterator<String> itr = copyArray.iterator();
		
		while(itr.hasNext()) {
			String i = (String)itr.next();
			System.out.println("Baap aa gya !! ~ Baap");
			System.out.println("Key is : "+i+" Value is : "+i);
			Thread.sleep(1000);
		}
		System.out.println(copyArray);
		
	}
}
