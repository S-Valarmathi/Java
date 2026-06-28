package Arrays;

public class SmallestArray {
    public static void main(String[] args){
        int[] numbers = {20,30,40,50};
        int smallest = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest: " + smallest);
    }
    
}
