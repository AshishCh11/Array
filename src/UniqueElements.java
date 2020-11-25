import java.util.Arrays;

class UniqueElements
    {
	 public static void main(String[] art) {
		    int a[] = { 1,2,1,2,4,5,6};  //1 1 2 2 4 5 6 
		    Arrays.sort(a);
		    System.out.println(Arrays.toString(a));
		    for (int j = 0; j < a.length; j++) {
		        if(j==0) {
		            if(a[j]!=a[j+1]) {
		                System.out.println("The unique number is :"+a[j]);
		            }
		        }else
		        if(j==a.length-1) {
		            if(a[j]!=a[j-1]) {
		                System.out.println("The unique number is :"+a[j]);
		            }
		        }else
		        if(a[j]!=a[j+1] && a[j]!=a[j-1]) {
		            System.out.println("The unique number is :"+a[j]);
		        }
		    }
	 }
    }