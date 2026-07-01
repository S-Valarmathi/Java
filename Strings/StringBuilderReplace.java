package Strings;

public class StringBuilderReplace {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Java");
        sb.replace(0, 4, "Python");
        System.out.println(sb);
    }
    
}
