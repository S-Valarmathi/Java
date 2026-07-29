package PracticeJava;

public class LargestElement{
    public static void main(String[] args){
        int arr[] = {10,25,5,47,19};
        int largest = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("LargestElement = " + largest);
    }
}