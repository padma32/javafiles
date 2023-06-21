package day13;
//import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class pque {
	public static void main(String args[]) {
		PriorityQueue <Integer> a=new PriorityQueue<Integer>();
		PriorityQueue <Integer> b=new PriorityQueue<Integer>();
		//a.add(1);
		//a.add(4);
		a.offer(49);
		a.offer(5);
		a.offer(1);
		a.offer(26);
		a.offer(88);
		a.offer(3);
		a.offer(6);
		//System.out.println(a.isEmpty());
		while(!(a.isEmpty())) {
			System.out.println(a.remove());
		}
		System.out.println(a.contains(9));
		//a.addFirst(6);
		
		//a.addAll(b);
		System.out.println();
		b.addAll(a);
		System.out.println(a.hashCode());
		System.out.println();
		System.out.println(a.size());
		System.out.println();
		//b.toArray();
		//System.out.println(b);
		for( Integer s:a) {
			System.out.println(s);
		}
		System.out.println();
		for( Integer s:b) {
			System.out.println(s);
		}

}
}



