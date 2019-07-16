package lab9_exercise_1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashSortinList 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> hm =new HashMap<Integer, Integer>();
		
		hm.put(2, 14);
		hm.put(1, 18);
		hm.put(9, 11);
		hm.put(4, 12);
		hm.put(5, 10);
		
		ArrayList al2=new ArrayList();
		
		al2=(ArrayList)getSort(hm);
		System.out.println(al2);
	
	}
	
	public static List getSort(HashMap<Integer, Integer> hm) 
	{
		ArrayList al=new ArrayList();
		
		Set s=hm.entrySet();
		
		Iterator itr =s.iterator();
		
		
		while(itr.hasNext()) 
		{
			Entry e=(Entry)itr.next();
			al.add(e.getKey());
		}
		Collections.sort(al);
		return al;
	}
}
	