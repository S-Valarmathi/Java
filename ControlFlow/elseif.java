package ControlFlow;

public class elseif {
    public static void main(String[] args){
        int mark = 70;
        if (mark >= 90){
            System.out.println("A Grade");
        }
        else if(mark >= 70){
            System.out.println("B Grade");
        }
        else if(mark >= 50){
            System.out.println("C Grade");
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
