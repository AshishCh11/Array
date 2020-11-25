public class TwoMaxNumbers {
 
    public void printTwoMaxNumbers(int[] nums){
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums){
            if(n>maxOne){
                maxTwo = maxOne;
                maxOne =n;
            } 
        }
        System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
    }
     
    public static void main(String a[]){
        int num[] = {1,9,2,12,4,9,12,6,8};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
    }
}