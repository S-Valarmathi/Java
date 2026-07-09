package Accesscontrol;

class Company {
    public void showCompany(){
        System.out.println("Welcome to ABC Company");
    }    
}

public class Employee{
    public static void main(String[] args){
        Company c1 = new Company();

        c1.showCompany();
    }
}
