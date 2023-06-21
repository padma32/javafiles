package day11;

public class stat {
	int rollno;
 String name;
 static String college="bit";
 static void change() {
	 college="cbit";
 }
	stat(int  r,String n) {
		rollno=r;
	name=n;
		
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
public static void main(String args[]) {
	stat.change();
	stat s=new stat(11,"kavaya");
	stat s1=new stat(22,"ramya");
	s.display();
	s1.display();
	
	
}
}
