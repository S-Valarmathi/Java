package Arrays;

public class EvenOdd {
    public static void main(String[] args){
        int[] numbers = {10,45,67,89,20,56};
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                System.out.println(numbers[i] + "Is Even");
            }
            else{
                System.out.println(numbers[i] + "Is Odd");
            }
        }
    }
    
}
