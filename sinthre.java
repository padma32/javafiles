package day14;
import java.util.Scanner;

public class sinthre extends Thread {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter assignment no");
		int n=sc.nextInt();
		System.out.println("doing assignment"+n);
		System.out.println("printing Started");
		for(int i=0;i<=4;i++) {
			System.out.println("cbit");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("muliplication");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a*b);
		
		
	}

}
