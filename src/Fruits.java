import java.util.ArrayList;

public class Fruits {
	  public static void main(String args[]){  
	      ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("mango");
	      alist.add("banan");
	      alist.add("graps");
	      alist.add("apple");
	     
	  
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "Steve" at the fourth position
	      alist.add(3, "strawberry");
	      alist.add(4, "pinaple");
	  
	      //displaying elements
	      System.out.println(alist);
	   }  
}
