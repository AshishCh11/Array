package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 5, 3, 2, 3, 9, 5 }; // 2 3 3 5 5 9
		int[] b = Arrays.stream(a).distinct().toArray();
		Arrays.stream(b).forEach(o -> System.out.println(o));

	}
}
