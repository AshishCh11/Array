
public class SumOfArrayElements {
	public static void main(String[] args) {
		int[] a = { 10, 25, 30, 40, 2 };
		int sum = 32;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum)
					System.out.println(a[i] + " " + a[j]);
			}
		}
	}
}


