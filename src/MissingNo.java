
public class MissingNo {
	
	 public static void main(String args[]) 
	 {
		int[] a = { 1, 2, 3, 5, 6, 7 };
		int missingNo = 0;

		for (int i = 0; i < a.length; i++) {
			if (i < a.length - 1) {
				if (a[i + 1] - a[i] > 1)
					missingNo = a[i] + 1;
			}
		}
		System.out.println(missingNo);	 
	 }
}
