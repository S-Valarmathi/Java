package Accesscontrol;

public class Student {
    private  int age  = 19;

    public void display(){
        System.out.println("Age: " + age);
        
    }

    
    public  static void main(String[] args){
        Student s1 = new Student();

        s1.display();
    }
    
}
