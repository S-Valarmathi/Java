package Arrays;

public class CountEven {
    public static void main(String[] args){
        int[] numbers = {34,56,78,98,77,33};
        int count = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                count++;
            }
        }
    System.out.println("Even count = " + count);
    }
    
}
