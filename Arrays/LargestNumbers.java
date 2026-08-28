package Arrays;

public class LargestNumbers{
    public static void main(String[] args){
        int[] numbers = {10,45,67,89,99,76};
        int largest = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}