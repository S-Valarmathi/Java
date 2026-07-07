

public class Person {
    void walk(){
        System.out.println("Person is Walking");
    }

    static class Teacher extends Person{
        void teach(){
            System.out.println("Teacher is teaching");
        }

        public static void main(String[] args){
            Teacher t1 = new Teacher();
            t1.walk();
            t1.teach();
        }


    }
    
}
