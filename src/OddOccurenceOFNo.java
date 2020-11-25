
public class OddOccurenceOFNo {

	public static void main(String[] args) {
		int a []={1,2,5,1,2,5,5};
		int x=0;
		for(int i=0;i<a.length;i++)
		{
			x=x^a[i];
			//System.out.println(x);
		}
		System.out.println("Rsult "+x);

	}

}
