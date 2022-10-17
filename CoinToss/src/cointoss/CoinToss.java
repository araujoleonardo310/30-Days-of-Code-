
package cointoss;

import java.util.Random;

public class CoinToss {
    
    public String tossAcoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        return toss == 0 ? "HEADS" : "TAILS";
    }
    
    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossAcoin());
        System.out.println(game.tossAcoin());
        System.out.println(game.tossAcoin());
        System.out.println(game.tossAcoin());
        System.out.println(game.tossAcoin());
        System.out.println(game.tossAcoin());
        System.out.println(game.tossAcoin());
        System.out.println(game.tossAcoin());
        System.out.println(game.tossAcoin());
      
    }
    
}
