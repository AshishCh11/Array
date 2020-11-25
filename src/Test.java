import java.util.Arrays;

public class Test {

	public static void main(String args[]) {

		int[] a = { 5, 6, 4, 1, 2, 5, 6, 4 };
		Arrays.sort(a);
		int occ = 1;

		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				if (a[i] == a[i + 1]) {
					occ++;
				}
			
			if (i < a.length - 1 && a[i] != a[i + 1]) {
				System.out.println(a[i] + " occrs " + occ);
				occ = 1;
			}
			}
			else {
			System.out.println(a[i] + " occrs " + occ);
			
		}
		}

	}
}
