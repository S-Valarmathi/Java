abstract class MusicPlayer{
    abstract void play();
}

public class Music extends MusicPlayer{
    @Override
    void play(){
        System.out.println("Music is Playing");
    }

    public static void main(String[] args){
        Music m1 = new Music();

        m1.play();
    }
}