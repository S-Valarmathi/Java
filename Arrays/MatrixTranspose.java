package Arrays;

public class MatrixTranspose {
    public static void main(String[] args){
        int[][] a = {
            {10,20,30},
            {40,50,60}
        };
        for(int j=0;j<a[0].length;j++){
            for(int i=0;i<a.length;i++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
