package day12;
import java.util.LinkedList;

import java.util.ListIterator;
import java.util.Iterator;


public class iterate {
	public static void main(String args[]) {
		LinkedList <String> a=new LinkedList<String>();
		LinkedList <String> b=new LinkedList<String>();
		a.addFirst("arpita");
		a.add("tejaswini");
		a.add("vinod");
		a.add("kiran");
		a.addLast("rajeswari");
		ListIterator i=a.listIterator();
		while(i.hasNext()) {
			if(i.next()=="vinod") {
				i.remove();
				
			}
		}
			System.out.println(a);
			
		
	
		
}
}
