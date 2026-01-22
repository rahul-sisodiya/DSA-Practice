package CoinCheaterProject;

import java.util.ArrayList;

public class tester {
    static void main(String[] args) {

        ArrayList<Blob> list = new ArrayList<>();
        for(int i = 0; i<1000; i++){
            if(i>=500){
                list.add(new Blob(false));
            }else {
                list.add(new Blob(true));
            }
        }
//        Blob player = new Blob(true);
        Detective conor = new Detective();
        int cheater = 0;
        int notCheater = 0;
        int guessedWrongCheater = 0;
       for(Blob player : list){

           if(conor.Inquire(player,5)){
               if(!player.cheater) guessedWrongCheater++;
               cheater++;
           }else{
               notCheater++;
           }
       }

        System.out.println("cheater = "+ cheater);


        System.out.println("not cheater = "+ notCheater);
        System.out.println("geussWrongCheater = "+ guessedWrongCheater);
    }
}
