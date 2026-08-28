package Arrays;

public class Search {
    public static void main(String[] args){
        int[] numbers = {12,45,67,89,98};
        int target = 67;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == target){
                System.out.println("Found at index: " + i);
            }
        }
    }
    
}
