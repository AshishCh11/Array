import java.util.Scanner;

public class SortWithoutSorting {
	public static void main(String args[])
    {
      int temp=0;   
      Scanner user_input=new Scanner(System.in);
       System.out.println("enter Size of Array...");
       int Size=user_input.nextInt();

    int[] a=new int[Size];
    System.out.println("Enter element Of an Array...");
    for(int j=0;j<Size;j++)
    {
        a[j]=user_input.nextInt();
    }     
    for(int i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
             if(a[i] > a[j] ) 
             {
                 temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }
        }
    }
    System.out.print("Output is:- ");
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }

}
}
