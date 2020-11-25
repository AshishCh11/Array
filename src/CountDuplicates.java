import java.util.Arrays;

public class CountDuplicates {
	public static void main(String args[])
	{
	 int[] numbers = { 7, 2, 1,6, 1,2, 4, 7, 4, 5, 4, 7, 7, 3, 1 ,8};
	 
     Arrays.sort(numbers);
     
     System.out.println("Sorted Array is :: = " + Arrays.toString(numbers));
               
     int count = 0;
     int tempCount = 0; // to keep local count of matched numbers
     String duplicates = "";
     for (int i = 1; i < numbers.length; i++) {
    	 
          if (numbers[i] == numbers[i-1]) {
        	
            if ((tempCount == 0)) { // If same number is repeated more than
                                     // two times, like 444, 7777
                 count = count + 1;
                 tempCount = tempCount + 1;
                 duplicates = duplicates.concat(Integer.toString(numbers[i])+ ",");
             }
          }
          else {
             tempCount = 0;
         }
     }

     System.out.println("No of duplicates :: = " + count);
     System.out.println("Duplicate Numbers are :: = " + duplicates);
	}
}
