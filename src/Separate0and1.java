

import java.util.Arrays;

public class Separate0and1 {
	public static void main(String[] args) {

		int a[] = new int[] { 0, 0, 1, 1, 0, 1, 1, 1, 0 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
