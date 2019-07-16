package streamapi;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayEx2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			int i =(int) itr.next();
			if(i%2!=0) {
				System.out.println(i);
			}
		
	}
}
}
