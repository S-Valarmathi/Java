package Strings;

public class StringBuilderDelete {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Java Programming");
        sb.delete(4,16);
        System.out.println(sb);
    }
    
}
