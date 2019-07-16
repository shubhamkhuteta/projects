package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class APIEx01 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(1);
		al.add(4);
		al.add(9);
		al.add(7);
		al.add(3);
		al.add(8);
		al.add(6);

		System.out.println("============\n\nOriginal List : "+al+"\n");

		long a = al.stream().filter(i->i>15).count();
		System.out.println("============\n\nCount : "+a+"\n");

		List<Integer> l = al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("============\n\nEven Numbers : "+l+"\n");

		List<Integer> l1 = al.stream().map(i->i+200).collect(Collectors.toList());
		System.out.println("============\n\nAdding 200 in each value : "+l1+"\n");

		List<Integer> l2 = al.stream().filter(i->i>15).collect(Collectors.toList());
		System.out.println("============\n\nGreater than 15 : "+l2+"\n");

		String str =al.stream().findFirst().toString();
		System.out.println("============\n\nFirst Value : "+str+"\n");

		List<Integer> l4 = al.stream().sorted((i1,i2)->(i1<i2) ? 1 : (i1>i2) ? -1 :0).collect(Collectors.toList());
		System.out.println("============\n\nDecending Order : "+l4+"\n");

		List<Integer> l5 = al.stream().sorted((i1,i2)->(i1>i2) ? 1 : (i1<i2) ? -1 :0).collect(Collectors.toList());
		System.out.println("============\n\nAscending Order : "+l5+"\n");

		int l6 = al.stream().min((i1,i2)->(i1>i2) ? 1 : (i1<i2) ? -1 :0).get();
		System.out.println("============\n\nMinimum for Ascending Order : "+l6+"\n");

		int l7 = al.stream().min((i1,i2)->(i1<i2) ? 1 : (i1>i2) ? -1 :0).get();
		System.out.println("============\n\nMinimum for Decending Order : "+l7+"\n");

		long l8 = al.stream().count();
		System.out.println("============\n\nTotal no. of Elements : "+l8+"\n");

		int l9 = al.stream().min((i1,i2)-> i1.compareTo(i2)).get();
		System.out.println("============\n\nMinimum for Decending Order (CT) : "+l9+"\n");

		int l10 = al.stream().min((i1,i2)-> i2.compareTo(i1)).get();
		System.out.println("============\n\nMaximum for Ascending Order (CT) : "+l10+"\n");

		System.out.println("============\n\nElements are :");
		al.stream().forEach(i ->{
			System.out.println(i);
		});

		System.out.println("============\n\nMinimum for Decending Order : "+l9+"\n");

	}
}
