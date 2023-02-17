
public class SumOfArrayElements {
	public static void main(String args[])
	   
	 public static void main(String[] args) {
		int[] a = { 10, 25, 30, 40 };
		int sum = 35;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] + a[i + 1] == sum) {
				System.out.println(a[i] + " " + a[i + 1]);
			}
		}
	}
}

