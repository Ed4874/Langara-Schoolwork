import java.util.ArrayList;

public class EdwardLQuiz3 {
    public static void main (String[] args) {
        //ArrayList<String> list = new ArrayList<String>() ;
//
        //list.add( "Andy" );
        //list.add( "Bart" );
        //list.add( "Carl" );
        //list.add( "Doug" );
        //list.add( "Elmo" );
//
        //list.add(4, "Oscar");
        //System.out.println(list);

        ArrayList<Coin> coins = new ArrayList<Coin>();
        coins.add(new Coin("dime", 10));
        coins.add(new Coin("quarter", 25));

        for(Coin c: coins) {
            System.out.println(c);
        }
}
