
public class EvenOddWithoutLoopOperator {
	  static int isEven(int n) 
	    { 
	           
	        // n&1 is 1, then  
	        // odd, else even 
	        return (n & 1); 
	    } 
	       
	    // Driver code 
	    public static void main(String args[]) 
	    { 
	        int n = 101; 
	        if(isEven(n)==0) 
	            System.out.print("Even"); 
	        else
	            System.out.print("Odd"); 
	    } 
	
//	    input : 5    // odd
//	    00000101              
//	  & 00000001                
//	 --------------                
//	    00000001       
//	 --------------
//
//	 input : 8     //even
//	    00001000              
//	  & 00000001                 
//	 --------------               
//	    00000000        
//	 -------------
}
