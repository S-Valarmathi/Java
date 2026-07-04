package OOP;

public class Hospital {
    String hospitalName;
    String doctorName;
    int patients;

    Hospital(){
        System.out.println("Welcome to the Hospital");
    }

    void display(){
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Patients: " + patients);
        System.out.println();
    }
    public static void main(String[] args){
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        Hospital h3 = new Hospital();

        h1.hospitalName = "Apollo Hospital";
        h1.doctorName = "aaaaa";
        h1.patients = 120;


        h2.hospitalName = "Kauvery Hospital";
        h2.doctorName = "bbbb";
        h2.patients = 95;

        h3.hospitalName = "Ganga Hospital";
        h3.doctorName = "cccc";
        h3.patients = 150;

        h1.display();
        h2.display();
        h3.display();
    }
    
}
