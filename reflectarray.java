package day6;
import java.lang.reflect.Array;
import java.util.Arrays;

public class reflectarray {
	public static void main(String args[]) {
		int a_size=6;
		int[] int_a=(int[])Array.newInstance(int.class,a_size);
		System.out.println(Arrays.toString(int_a));
	}

}
