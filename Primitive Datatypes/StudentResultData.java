import java.util.Scanner;

public class StudentResultData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter age: ");
        byte age = sc.nextByte();

        System.out.print("Enter total mark: ");
        short totalMark = sc.nextShort();

        System.out.print("Enter percentage: ");
        float percentage = sc.nextFloat();

        System.out.print("Enter average mark: ");
        double average = sc.nextDouble();

        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);

        System.out.print("Student passed? (true/false): ");
        boolean pass = sc.nextBoolean();

        System.out.println("\nStudent Result Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Total Mark: " + totalMark);
        System.out.println("Percentage: " + percentage);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + pass);

        sc.close();
    }
}