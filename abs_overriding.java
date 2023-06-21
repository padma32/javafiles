package day10;

abstract class car1 {
	public abstract void drive();
	public void drive(int a) {
		System.out.println("drive1:"+a);
	}

	public void music(){
		System.out.println("I can play music");
		
	}}
	abstract class honda1 extends car1{
		public abstract void fly();
		public void drive(){
				System.out.println("I can drive");
	}
	}
	 class updatedhond1 extends honda1{
		public  void fly() {
			System.out.println("I can fly");
		}}
	public class abs_overriding{
		public static void main(String args[]) {
			updatedhond1 s=new updatedhond1();
			s.drive();
			s.music();
			s.fly();
			s.drive(8);
			
		
		}
		

}
