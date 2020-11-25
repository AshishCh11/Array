import java.util.Arrays;


class CountOcurrances
{
	public static void main(String args[])
	{
		int ar[]=new int[] {1,1,1,2,4,5,1,2,6,4,5,2};
		Arrays.sort(ar);  // 1 1 1 1 2 2 2 4 4 5 5  
	    int i;
	    int occ=1;
	    for(i=0;i<ar.length;i++)
	    {
	    	if(i<ar.length-1)
	    	{
	    		if(ar[i]==ar[i+1])
	    		{
	    			occ++;
	    		}
	    		if(i<ar.length-1 && ar[i]!=ar[i+1])
	    		{
	    			System.out.println(ar[i]+" occurs "+occ+" times");
	    			occ=1;
	    		}
	    	}
	    		else
	    		{
	    			System.out.println(ar[i]+" occurs "+occ+" times");
	    		}
	    	}
	    }
	}
	
