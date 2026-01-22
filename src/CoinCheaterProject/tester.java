package CoinCheaterProject;

public class tester {
    static void main(String[] args) {
        int chead = 0;
        int ctail = 0;
        int head = 0;
        int tail = 0;
        Blob cuser = new Blob(true);
        Blob user = new Blob(false);
        for(int i = 0; i<Integer.MAX_VALUE; i++){
            if(cuser.toss()) {
                chead++;
            }else{
                ctail++;
            }
            if(user.toss()){
                head++;
            }else{
                tail++;
            }
        }
        System.out.println("user" +":- heads = "+head+" tails= "+tail);
        System.out.println("cuser" +":- heads = "+chead+" tails= "+ctail);



    }
}
