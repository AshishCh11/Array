import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeTwoArrayList {
	public static void main(String args[])
	{
	ArrayList<String> listA = new ArrayList<String>();

    listA.add("A");
    listA.add("B");

    List<String> listB = new ArrayList<String>();

    listB.add("B");
    listB.add("C");

    Set<String> newSet = new HashSet<String>(listA);

    newSet.addAll(listB);
    ArrayList<String> newList = new ArrayList<String>(newSet);

    System.out.println("New List :"+newList);
}
	
	
	
	
//	{
//	ArrayList<Integer> listA = new ArrayList<Integer>();
//
//    listA.add(1);
//    listA.add(2);
//
//    List<Integer> listB = new ArrayList<Integer>();
//
//    listB.add(2);
//    listB.add(3);
//
//    Set<Integer> newSet = new HashSet<Integer>(listA);
//
//    newSet.addAll(listB);
//    ArrayList<Integer> newList = new ArrayList<Integer>(newSet);
//
//    System.out.println("New List :"+newList);
//}
}