package Operators;

public class DrivingLicense {
    public static void main(String[] args){
        int age = 20;
        boolean HasLearnerLicense = true;
        boolean medicalCheck = true;
        if(age>=18  && HasLearnerLicense && medicalCheck ){
            System.out.println("Eligible for Driving License");
        }
        else{
            System.out.println("Not Eligible for Driving License");
        }
    }
    
}
