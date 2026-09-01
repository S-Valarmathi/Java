package Arrays;

public class CountEvent {
    public static void main(String[] args){
        int[] numbers = {10,20,30,39,50,60,97,23,43};
        int count = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
            count++;
            }
        }
        System.out.println("Event count = " + count);
    }
    
}
