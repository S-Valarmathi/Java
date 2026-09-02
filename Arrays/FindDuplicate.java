package Arrays;

public class FindDuplicate {
    public static void main(String[] args){
        int[] a = {10,20,10,40,20,40};

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println("Duplicate = " +a[i]);
                }
            }
        }
    }
    
}
