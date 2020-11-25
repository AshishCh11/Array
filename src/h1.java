import java.util.Scanner;

public class h1 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];

		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");
		System.out.println();

	}

	private static int[] arrayLeftRotation(int[] a, int n, int k) {

		int temp, i, j;
		for (i = 0; i < k; i++) {
			temp = a[0];
			for (j = 1; j < n; j++) {

				a[j - 1] = a[j];

				// 12345 23451 34512 45123 51234 this logic apply here
				// 12345 12354 12534 15234 51234
			}
			a[n - 1] = temp;
		}

		return a;
	}

}

//Arrays: Left Rotation
//Output Format
//Print a single line of  space-separated integers denoting the final state of the array after performing  left rotations.
//Sample Input
//5 4
//1 2 3 4 5
//Sample Output
//
//5 1 2 3 4