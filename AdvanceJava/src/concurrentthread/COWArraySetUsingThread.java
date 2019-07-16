package concurrentthread;

import java.util.concurrent.CopyOnWriteArraySet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class COWArraySetUsingThread extends Thread{

static CopyOnWriteArraySet<String> copyArraySet = new CopyOnWriteArraySet<String>();
		
		public void run() {
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("I got it!! ~ Beta");
			System.out.println("Welcome to Capgemini!!");
			copyArraySet.add("Pitaji");
			copyArraySet.clear();
		}
		
		public static void main(String[] args) throws InterruptedException {
			copyArraySet.add("Shubham");
			copyArraySet.add("Atom");
			copyArraySet.add("Pankaj");
			copyArraySet.add("Sanskar");
			
			COWArraySetUsingThread chm = new COWArraySetUsingThread();
			chm.start();
			
			
			java.util.Iterator<String> itr =  copyArraySet.iterator();
			
			while(itr.next() != null) {
				String values = (String) itr.next();
				System.out.println("Baap aa gya !! ~ Baap");
				System.out.println("Key is : "+values+" Value is : "+values);
				Thread.sleep(1000);
			}
			System.out.println(copyArraySet);
			
		}
	}

