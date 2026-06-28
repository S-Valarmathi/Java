package Arrays;

public class EvenArray {
    public static void main (String[] args){
        int[] arr = {11, 22, 33, 40, 50};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
