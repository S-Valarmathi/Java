package Arrays;
import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args){
        int[] a = {45,67,86,90,888,89};

        Arrays.sort(a);
        int secondLargest = a[a.length-2];

        System.out.println("Second Largest = " + secondLargest );
    }
}
    