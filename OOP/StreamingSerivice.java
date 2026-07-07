public class StreamingSerivice {
    void login(){
        System.out.println("User logged in successfully");
    }

    void watchMovie(){
        System.out.println("Movie is now playing");
    }

    void logout(){
        System.out.println("User logged out successfully");
    }

    static class Netflix extends StreamingSerivice{
        void downloadMovie(){
            System.out.println("Movie downloaded successfully");
        }
        void addToWatchlist(){
            System.out.println("Movie added to watchlist");
        }
        void changeVideoQuality(){
            System.out.println("Video quality changed to HD");
        }

        public static void main(String[] args){
            Netflix n1 = new Netflix();

            n1.login();
            n1.watchMovie();
            n1.logout();
            n1.downloadMovie();
            n1.addToWatchlist();
            n1.changeVideoQuality();
        }
    }
    
}
