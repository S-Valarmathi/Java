package Methods;

public class MarkStatic {
    static void showname(String name){
        System.out.println("Name: " + name);
    }
    static int getmarks(){
        System.out.println("Mark");
        return 75;
    }
    static void result(int marks){
        if(marks >= 50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
        public static void main (String[] args){
            showname("Valarmathi");
            int marks = getmarks();
            result(marks);


    }
    
}
