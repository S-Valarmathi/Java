class University{
    void opeCampus(){
        System.out.println("Campus is Open");
    }
    void conductExam(){
        System.out.println("Exams are conducted");

    }
    void announceResults(){
        System.out.println("Resuls are announced");
    }
}

public class EngineeringCollege extends University{
    void conductLab(){
        System.out.println("Lab classes are conducted");

    }

    void placeStudents(){
        System.out.println("Studetns are placed");
    }
    public static void main(String[] args){
        EngineeringCollege e1 = new EngineeringCollege();

        e1.opeCampus();
        e1.conductExam();
        e1.announceResults();
        e1.conductLab();
        e1.placeStudents();

    }

}