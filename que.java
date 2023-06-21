package day13;
import java.util.ArrayList;
import java.util.ArrayDeque;

public class que {
	public static void main(String args[]) {
		ArrayDeque <Integer> a=new ArrayDeque<Integer>();
		ArrayDeque <Integer> b=new ArrayDeque<Integer>();
		a.add(1);
		a.add(4);
		//a.addFirst(6);
		a.addLast(5);
		a.offerFirst(9);
		a.addFirst(6);
		
		//a.addAll(b);
		b.addAll(a);
		System.out.println(a.hashCode());
		System.out.println(a.size());
		//b.toArray();
		System.out.println(b);
		for( Integer s:a) {
			System.out.println(s);
		}
		System.out.println();
		for( Integer s:b) {
			System.out.println(s);
		}

}
}
