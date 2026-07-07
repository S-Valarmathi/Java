interface Camera{

    void capturePhoto();

}

public class DSLR implements Camera{
    @Override

    public void capturePhoto(){
        System.out.println("Photo captured successfully");
    }

    public static void main(String[] args){
        DSLR d1 = new DSLR();

        d1.capturePhoto();
    }

}