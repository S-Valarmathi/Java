package Arrays;

public class CountArray{
    public static void main(String[] args){
        int[] numbers = {34,56,78,98,76};
        int count = 0;
        for(int i=0;i<numbers.length;i++){
            count++;
        }
        System.out.println("Count = " + count);
    }
}