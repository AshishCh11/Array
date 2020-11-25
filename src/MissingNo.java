
public class MissingNo {
	
	 public static void main(String args[]) 
	 {
		 int [] a={1,2,4,5,6};
		 int sum=0,i;
		 int exno=a.length+1;
		 int n=exno+1;
		 int tsum=(exno*n)/2;
		 
		 for(i=0;i<a.length;i++)
		 {
			 sum=sum+a[i];
		 }
		 System.out.println(tsum-sum);
		 
		 
		 
	 }
}
