package OOP;

public class Person {
    void walk(){
        System.out.println("Person is Walking");
    }

    static class Teacher extends Person{
        void teach(){
        System.out.println("Teacher is teaching");
        }
        
    }

    

    public static void main(String[] args){
        Person t1 = new Person();
        Teacher t2 = new Teacher();

        t1.walk();
        t2.teach();
    }
    
}
