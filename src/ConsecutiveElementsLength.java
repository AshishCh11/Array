import java.util.Arrays;

public class ConsecutiveElementsLength {
	public static void main(String args[])
	 {
	    int a[]={5,4,93,9,5,90,92,1,3,91};
	    int i,j,temp;
	    int count=1,max=0;
	    for(i=0;i<a.length;i++)
	    {
	    	for(j=i+1;j<a.length;j++)
	    	{
	    		if(a[i]>a[j])
	    		{
	    			temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}
	    	}
	    }
	    for(i=0;i<a.length;i++)
	    
	    System.out.print(a[i]+" ");
	    
	    for(i=0;i<a.length;i++)
	    {
	    	int k;
	    	for(k=i+1;k<a.length;k++)
	    	{
	    		if(a[i]+1==a[k])
	    		{
	    			count++;
	    			break;
	    		}
	    		else if (a[i]+1!=a[k])
	    		{
	    			count=1;
	    			
	    		}
	    	  }
	        }
	    if(count>max)
			max=count;
   	System.out.println("max subsequence is "+max);
	 }
	 }

