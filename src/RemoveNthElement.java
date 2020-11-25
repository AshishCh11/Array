import java.util.Arrays;
import java.util.Scanner;

public class RemoveNthElement {
      
	public static void main(String args[])
	{  
		int i,k,pos;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of elements :");
	int n=sc.nextInt();
	int a[] = new int[n];
	System.out.println("enter elements");
	for(i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	System.out.println("enter the position :");
	pos=sc.nextInt();
	int poss=pos-1;
	for(i=0;i<a.length;i++)
	{
		if(i==poss)
		{
			for(k=i+1;k<a.length;k++)
			{
				a[i]=a[k];
				i++;
			}
		}
	}
	for(i=0;i<a.length-1;i++)
	{
		System.out.print(a[i]+" ");
	}
}
}