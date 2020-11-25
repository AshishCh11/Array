import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class h2 {

    // Complete the minimumSwaps function below.
   static int minimumSwaps(int[] arr) {
    int count = 0;
    for(int i=0; i<arr.length; i++){
        while(arr[i] != i+1) {
        	// 2 3 4 1 5    23145 21345 12345 
        	//
             int temp = arr[i];
            arr[i] = arr[temp-1];
            arr[temp-1] = temp;  
            count ++;
        }
    }
    return count;
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


//Sample Input 1
//
//5
//2 3 4 1 5
//Sample Output 1
//
//3

// min no of swaps ro order a array