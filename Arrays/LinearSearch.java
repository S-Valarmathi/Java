package Arrays;

public class LinearSearch {
    public static void main(String[] args){
        int[] numbers = {10,20,30,40,50};
        int search = 30;
        boolean found = false;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == search){
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
    
}
