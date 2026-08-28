package Arrays;

public class SmallestNumber{
    public static void main(String[] args){
        int[] numbers = {23,56,78,98,76,54};
        int smallest = numbers[0];
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println(smallest);

    }
}