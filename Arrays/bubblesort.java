package Arrays;

public class bubblesort {
    public static void main(String[] args){
        int[] arr = {10,40,20,60, 67,99, 98};
        for(int i=0; i<arr.length-i; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }
    
}
