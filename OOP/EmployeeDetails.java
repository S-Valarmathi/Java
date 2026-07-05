package OOP;

public class EmployeeDetails {
    private String employeeName;
    private int employeeId;
    private double salary;

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getEmployeeName(){
        return employeeName;
    }
    
    public int getEmployeeId(){
        return employeeId;
    }

    public double getSalary(){
        return salary;
    }

    public static void main(String[] args){
        EmployeeDetails e1 = new EmployeeDetails();

        e1.setEmployeeName ("Valarmathi");
        e1.setEmployeeId (233);
        e1.setSalary (50000);

        System.out.println("Employee Name: " + e1.employeeName);
        System.out.println("Employee ID: " + e1.employeeId);
        System.out.println("Salary: " + e1.salary);
    }
}
