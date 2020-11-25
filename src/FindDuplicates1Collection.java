import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates1Collection {

    public static void main(String[] args) {
    	int count=0;
    	 String[] array = {"ab","ac","ab"};
         
        Set<String> set = new HashSet<String>();
         
        for(int i = 0; i < array.length ; i++)
        {
            //If same integer is already present then add method will return FALSE
            if(set.add(array[i]) == false)
            {
            	count++;
                System.out.println("Duplicate element found : " + array[i]);
            }
    }
        System.out.println(count);
    	    }
    }