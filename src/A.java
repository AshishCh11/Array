import java.util.Scanner;

public class A {

	public static void main(String args[]) {

		int a[] = { 1, 1, 1, 2, 4, 5, 1, 2, 6, 4, 5, 2 };

		int i, j, k, temp, count = 1;

		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");

		for (i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				if (a[i] == a[i + 1]) {
					count++;
				}
				if (i < a.length - 1 && a[i] != a[i + 1]) {
					System.out.println(a[i] + " occurs " + count + " times ");
					count=1;
				}
			} else {
				System.out.println(a[i] + " occurs " + count + " times ");
			}

		}

	}
}