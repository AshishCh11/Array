

import java.util.Arrays;

public class MaxMin {
	
	 public static void main(String args[]){
		 
		 int [] A={1,2,5,3,4,5};
	        int max;
	        int N=A.length;
	        int min = max = A[0];
			for (int i = 1; i < N; ++i) {
				if (A[i] < min) 
					{
					min = A[i];
					}
			    if (A[i] > max)
			    	{
			    	max = A[i];
			}
			}
			System.out.println("Minimum is :"+min);
			System.out.println("maximum is :"+max);
	}
}
