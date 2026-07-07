

public class StudentDetails{
    String name;
    int age;

    StudentDetails(String n, int a ){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args){
        StudentDetails s1 = new StudentDetails ("Valarmathi", 19);
        s1.display();
    }
    
}
