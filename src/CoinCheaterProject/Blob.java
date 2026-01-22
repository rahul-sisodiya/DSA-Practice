package CoinCheaterProject;

public class Blob {
    boolean cheater;
    public Blob(boolean cheater){
        this.cheater = cheater;
    }

    public boolean toss(){
        double rand = Math.random();
        if(cheater){
            rand += 0.3;
        }
        if(rand>=0.5) return true;
        return false;
    }

    public int toss(int times){
        int count = 0;
        for(int i = 0; i<times; i++){
            if(toss()){
                count++;
            }
        }
        return count;
    }

}
