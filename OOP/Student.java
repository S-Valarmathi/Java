package OOP;

public class Student {
    int rollNO;
    String name;
    String department;
    double cgpa;

    void display(){
        System.out.println("Roll No: " + rollNO);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
    }
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollNO = 101;
        s1.name = "aaaa";
        s1.cgpa = 8.50;

        s2.rollNO = 102;
        s2.name = "bbbb";
        s2.cgpa = 8.54;

        s3.rollNO = 103;
        s3.name = "cccc";
        s3.cgpa = 8.58;

        s1.display();
        s2.display();
        s3.display();


    }
}
