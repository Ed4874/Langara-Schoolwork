import java.util.ArrayList;

public class CoinQuiz {
    public static void main (String[] args) {
        ArrayList<Coin> coins = new ArrayList<Coin>();
        coins.add(new Coin("dime", 10));
        coins.add(new Coin("quarter", 25));

        for (int i = 0; i < coins.size(); i++){
            System.out.println(coins.get(i));
        }

        for(Coin c: coins) {
            System.out.println(c);
        }
    }
}
