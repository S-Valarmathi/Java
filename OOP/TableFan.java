abstract  class Appliance {
    abstract void turnon();
    abstract void turnoff();
    
}

public class TableFan extends Appliance{
    @Override
    void turnon(){
        System.out.println("Fan is turned on");
    }
    
    @Override
    void turnoff(){
        System.out.println("Fan is turned off");
    }

    public static void main(String[] args){
        TableFan f1 = new TableFan();
        f1.turnon();
        f1.turnoff();
    }
}