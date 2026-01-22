package CoinCheaterProject;

public class Detective {
    int times;
//    public Detective(int times){
//        this.times = times;
//    }
    public boolean Inquire(Blob user,int times){
        if(times-1 <= user.toss(times)) return true;
        return false;
    }
}
