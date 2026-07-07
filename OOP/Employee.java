

public class Employee {
    int empid;
    String empName;
    String department;

    void display(){
        System.out.println("EmpId: " + empid);
        System.out.println("EmpName: " + empName);
        System.out.println("Department: " + department);

    }

    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.empid = 101;
        e1.empName = "aaa";
        e1.department = "IT";


        e2.empid = 102;
        e2.empName = "bbb";
        e2.department = "CSE";


        e1.display();
        e2.display();
    } 

    
}
