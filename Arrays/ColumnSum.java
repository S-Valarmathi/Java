package Arrays;

public class ColumnSum {
    public static void main(String[] args){
        int[][] a = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        for(int j=0;j<a.length;j++){
            int sum = 0;

            for(int i=0;i<a.length;i++){
                sum = sum + a[i][j];
            }

            System.out.println("Column " + (j+1) + "Sum = " + sum);
        }
      
        
    }
    
}
