package day12;
import java.util.LinkedList;

public class linked {
	public static void main(String args[]) {
		LinkedList <String> a=new LinkedList<String>();
		LinkedList <String> b=new LinkedList<String>();
		a.add("pooji");
		a.addFirst("syam");
		a.addLast("krish");
System.out.println(a.containsAll(a));
System.out.println(a.contains("krish"));
a.pop();
//a.element();
System.out.println(a.peek());
a.push("era");
a.poll();

		
		for( String s:a) {
			System.out.println(s);
		}
		
	}
}