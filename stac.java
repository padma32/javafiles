package day12;
import java.util.Stack;
//import java.util.LinkedList;

import java.util.ListIterator;
import java.util.Iterator;

public class stac {
	

		public static void main(String args[]) {
	Stack <String> a=new Stack<String>();
			//LinkedList <String> b=new LinkedList<String>();
			a.add("arpita");
			a.add("tejaswini");
			a.add("vinod");
			a.add("kiran");
			a.add("rajeswari");
			a.push("ram");
			a.pop();
			a.remove("vinod");
			//ListIterator i=a.listIterator();
			for( String s:a) {
				System.out.println(s);
			}
	}
	}

