package day5;
import java.util.Scanner;
public class revpy {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			/* increasing*/
				for(int j=1;j<i;j++) {
					System.out.print("*");}
				System.out.println();
				}
		//reverse pyramid
		for( int i=1;i<=n;i++) {

			for(int j=1;j<=i+1;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<n-1;j++) {
				System.out.print("*");
			}
			
			for(int j=i;j<=n-1;j++) {
				System.out.print("*");
			}
			System.out.println();
				
	}
		
	}

}
