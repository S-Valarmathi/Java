

public class Passport {
    private String passportHolder;
    private String country;
    private long passportNumber;

    public void setPassportHolder(String passportHolder){
        this.passportHolder = passportHolder;
    }
    
    public void setCountry(String country){
        this.country = country;
    }

    public void setPassportNumber(long passportNumber){
        this.passportNumber = passportNumber;
    }

    public String getPassportHolder(){
        return passportHolder;
    }

    public String getCountry(){
        return country;
    }

    public long getPassportNumber(){
        return passportNumber;
    }

    public static void main(String[] args){
        Passport p1 = new Passport();
        p1.setPassportHolder("Valarmathi");
        p1.setCountry("India");
        p1.setPassportNumber(1234567890);

        System.out.println("Passport Holder Name: " + p1.getPassportHolder());
        System.out.println("Country: " + p1.getCountry());
        System.out.println("Passport Number: " + p1.getPassportNumber());

    }
}
