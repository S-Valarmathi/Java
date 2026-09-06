package Arrays;

public class RowSum {
    public static void main(String[] args){
        int[][] a = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        for(int i=0;i<a.length;i++){
            int sum = 0;

        for(int j=0;j<a.length;j++){
            sum = sum+a[i][j];
        }
        System.out.println("Row " + (i+1) + "Sum = " + sum);
        }
    }
    
}
