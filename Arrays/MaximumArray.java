package Arrays;

public class MaximumArray {
    public static void main(String[] args){
        int[] arr = {23, 56, 76, 89, 90, 145};
        int maximum = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        System.out.println("Maximum = " + maximum);
    }
    
}
