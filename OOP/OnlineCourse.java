

public class OnlineCourse {
    String CourseName;
    String TrainerName;
    int duration;
    int fees;

    OnlineCourse(String CourseName, String TrainerName, int duration, int fees){
        this.CourseName = CourseName;
        this.TrainerName = TrainerName;
        this.duration = duration;
        this.fees = fees;

    }

    void display(){
        System.out.println("Course Name: " + CourseName);
        System.out.println("Trainer Name: " + TrainerName);
        System.out.println("Duration: " + duration);
        System.out.println("Fees: " + fees);
        System.out.println();

    }

    public static void main(String[] args){
        OnlineCourse c1 = new OnlineCourse("Data Science", "Priya", 8, 3500 );
        OnlineCourse c2 = new OnlineCourse("Cloud Computing", "dharshini", 12, 35000);
        c1.display();
        c2.display();
    }
    
}
