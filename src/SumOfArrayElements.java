
public class SumOfArrayElements {
	public static void main(String args[])
	   
	   {
		   int [] a1={10,25,30,40};
		   int sum=35;
		   int i,j;
		   for(i=0;i<a1.length;i++)
		   {
			   for(j=i+1;j<a1.length;j++)
			   {
				   if(a1[i]+a1[j]==sum)
				   {
					   System.out.print(a1[i]+" "+a1[j]);
				   }
			   }
		   }
	   }

//	{
//		int [] a1={10,25,30,40};
//		int sum=0;
//		 int i,j;
//		   for(i=0;i<a1.length;i++)
//		   {
//			   sum= sum+a1[i];
//			   
//		   }
//		System.out.println(sum);
//		
//	}
	
	
}
