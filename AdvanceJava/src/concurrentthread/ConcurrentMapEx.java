package concurrentthread;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapEx {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<Integer, String>();
		chm.putIfAbsent(1, "Shubham");
		chm.putIfAbsent(2, "Sanskar");
		chm.putIfAbsent(2, "Saasdnskar");
		boolean res = chm.remove(2,"Shubham");
		boolean res2 = chm.replace(1, "Shubham", "newValue");
		System.out.println(chm);
		System.out.println(res);
		System.out.println(res2);
		
	}
}
