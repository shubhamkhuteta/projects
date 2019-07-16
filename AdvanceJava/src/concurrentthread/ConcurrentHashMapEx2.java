package concurrentthread;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx2 extends Thread{
	static ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<Integer, String>();
	
	public void run() {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("I got it!! ~ Beta");
		System.out.println("Welcome to Capgemini!!");
		hm.put(5, "Pitaji");
		hm.clear();
	}
	
	public static void main(String[] args) throws InterruptedException {
		hm.put(1, "Shubham");
		hm.put(2, "Atom");
		hm.put(3, "Pankaj");
		hm.put(4, "Sanskar");
		
		ConcurrentHashMapEx2 chm = new ConcurrentHashMapEx2();
		chm.start();
		
		Set<Integer> s = hm.keySet();
		Iterator<Integer> itr = s.iterator();
		
		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
			System.out.println("Baap aa gya !! ~ Baap");
			System.out.println("Key is : "+i+" Value is : "+hm.get(i));
			Thread.sleep(1000);
		}
		System.out.println(hm);
		
	}
}
