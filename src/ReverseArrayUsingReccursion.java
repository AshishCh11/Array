import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsingReccursion {
	 static int [] a;
		
	   public static void reverseRecursive(int start, int end){

		        if(start<=end){
		            int temp = a[start];
		            a[start] = a[end];
		            a[end] = temp;
		            start++;
		            end--;
		            reverseRecursive(start, end);
		        }
		    }
	  public static void main(String[] args) {
	    a = new int []{10,2,3,4,5};
	 
	   reverseRecursive(0,a.length-1);
	   System.out.println("Reversed Again:" + Arrays.toString(a));
		    }
		}
