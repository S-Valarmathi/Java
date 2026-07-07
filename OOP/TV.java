abstract class RemoteControl {
    abstract void pressPowerButton();


}

public class TV extends RemoteControl{
    @Override
    void pressPowerButton(){
        System.out.println("Smart Tv is turned on");
    }

    public static void main(String[] args){
        TV t1 = new TV();

        t1.pressPowerButton();;
    }
}
