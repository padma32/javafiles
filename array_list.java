package day12;
import java.util.ArrayList;

public class array_list {
	public static void main(String args[]) {
		ArrayList <String> a=new ArrayList<String>();
		ArrayList <String> b=new ArrayList<String>();
		//ArrayList c=new ArrayList();
		a.add("ram");
		a.add("syam");
		//a.add(10.0);
		b.addAll(a);
		a.add(2, "ramya");
		System.out.println(a.clone());
		System.out.println(a.get(1));
		a.set(1,"y");
		System.out.println(a);
	//a.clear();
		//a.remove(2);
		//a.remove("ram");
		//System.out.println(a.contains("y"));
		for( String s:a) {
			System.out.println(s);
		}
		//System.out.println(a);
	//	System.out.println(b);
		//System.out.println(c);
		
	}

}
