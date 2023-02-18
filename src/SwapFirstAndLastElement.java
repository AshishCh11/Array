import java.util.Arrays;

public class SwapFirstAndLastElement {
	public static void main(String[] args) {
		int a[] = { 20, 30, 40, 50, 60 };
		int temp = a[0];
		a[0] = a[a.length - 1];
		a[a.length - 1] = temp;

		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);

	}
}
