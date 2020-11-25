
public class RevArrayREccursion {

	public static void main(String[] args) {
	
		int  [] a={4 ,2 ,8 ,1};
		int l=0;
		int r=a.length-1;
		int [] re=Rev(a,l,r);
		for(int i:re)
		System.out.print(i+" ");
	}
	 static int[] Rev(int a[],int l,int r)
	 {
		 int temp;
		if(l<=r)
		 {
			 temp=a[l];
			 a[l]=a[r];
			 a[r]=temp;
			 l++;
			 r--;
			 Rev(a,l,r);
		 }
		 
		 
	return a ;
	}

}
