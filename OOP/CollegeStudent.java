

public class CollegeStudent {
    private String StudentName;
    private String department;
    private int rollNumber;
    private double cgpa;
    private boolean hostelStudent;

    public void setStudentName(String StudentName){
        this.StudentName = StudentName;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }
    
    public void setHostelStudent(boolean hostelStudent){
        this.hostelStudent = hostelStudent;
    }

    public String getStudentName(){
        return StudentName;
    }

    public String getDepartment(){
        return department;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public double getCGPA(){
        return cgpa;

    }

    public boolean getHostelStudent(){
        return hostelStudent;
    }

    public static void main(String[] args){
        CollegeStudent c1 = new CollegeStudent();
        c1.setStudentName("Valarmathi");
        c1.setDepartment("CSE");
        c1.setRollNumber(233);
        c1.setHostelStudent(false);
        c1.setCgpa(8.59);

        System.out.println("Student Name: " + c1.getStudentName());
        System.out.println("Department: " + c1.getDepartment());
        System.out.println("Roll Number: " + c1.getRollNumber());
        System.out.println("Hostel Student " + c1.getHostelStudent());
        System.out.println("CGPA " + c1.getCGPA());

    }
}
