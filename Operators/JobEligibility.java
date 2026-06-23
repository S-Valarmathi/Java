package Operators;

public class JobEligibility {
    public static void main(String[] args){
        int age = 20;
        boolean qualification = true;
        if ( age >= 18  && qualification == true){
            System.out.println("Eligible for job");
        }
        else {
            System.out.println("Not eligible for job");
        }
    }
    
}
