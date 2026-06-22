class StudentMark{
    public static void main(String[] args){
        String StudentName = "Valarmathi";
        String course = "CSE";

        int[] marks = {80, 96, 87, 79, 90};
        System.out.println("-----STUDENT DETAILS-----");
        System.out.println("Name : " + StudentName);
        System.out.println("Course: " + course);

        System.out.println("\nMarks:");

        for(int i=0; i<marks.length; i++){
            System.out.println("Subject " + (i+1) + ":" + marks[i]);;
        }
    
    }
}