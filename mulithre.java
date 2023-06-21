package day14;
import java.util.Scanner;
class y extends Thread{
	Scanner sc=new Scanner(System.in);
	public void run() {
		System.out.println("assignment started");
		int n=sc.nextInt();
		System.out.println("assignment no"+n);
	}
}
 class r extends Thread{
	public void run() {
		System.out.println("started");
		for(int i=0;i<=3;i++) {
			System.out.println("cbit");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
 class red extends Thread{
	public void run() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("multiply");
	
	int a=10;
	int b=20;
	System.out.println(a*b);
}
}

public class mulithre {
	public static void main(String args[]) {
		y uni=new y();
		r two=new r();
		red three=new red();
		uni.start();
		two.start();
		three.start();
		
	}

}
