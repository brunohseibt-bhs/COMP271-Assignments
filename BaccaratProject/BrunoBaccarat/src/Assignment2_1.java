import cards.Card;
import cardtools.PokerSolver;
import gambler.Gambler;
import hand.Hand;
import hand.PokerHand;
import hand.BaccaratHand;
import java.util.ArrayList;

public class Assignment2_1 {

    public static void main(String[] args) {
        
        ArrayList<Card> deck = new ArrayList<Card>(); 

        for(int i = 0; i < 52; i++){

            deck.add(new Card(i + 1));

        }
        printDeck(deck, "Deck");
        System.out.println();
        shuffleDeck(deck);
        printDeck(deck, "Shuffled Deck");
        System.out.println();

        Gambler Bruno = new Gambler("1", "Bruno", 1000, new PokerHand());
        Gambler Kevin = new Gambler("2", "Kevin", 1500, new PokerHand());

        for(int i = 0; i < 5; i++){

            Card dealtCard = deck.remove(0);
            Bruno.getHand().addCard(dealtCard);
            dealtCard = deck.remove(0);
            Kevin.getHand().addCard(dealtCard);

        }

    
        PokerSolver.evaluateHand((PokerHand) Bruno.getHand());
        PokerSolver.evaluateHand((PokerHand) Kevin.getHand());
        int[] results = PokerSolver.evaluatePokerGame((PokerHand) Bruno.getHand(), (PokerHand) Kevin.getHand());

        System.out.println(Bruno.getName() + "'s Hand: " + Bruno.getHand() + " " + ((PokerHand) Bruno.getHand()).getHandDescr());
        System.out.println(Kevin.getName() + "'s Hand: " + Kevin.getHand() + " " + ((PokerHand) Kevin.getHand()).getHandDescr());
        System.out.println();

        if(results[0] == 1){
            System.out.print("Results: " + Bruno.getName() + " wins!\n");
        } else if (results[1] == 1){
            System.out.print("Results: " + Kevin.getName() + " wins!\n");
        } else {
            System.out.print("Tie.\n");
        }
        System.out.println();

        System.out.println(Bruno.getName() + "'s " + (Bruno.getHand()).showAttributes());

        System.out.println(Kevin.getName() + "'s " + (Kevin.getHand()).showAttributes());

        System.out.println();
        printDeck(deck, "Deck After deal ");
        System.out.println();
        returnCard(Bruno, deck);
        returnCard(Kevin, deck);
        System.out.println();
        printDeck(deck, "Restacked Deck ");
       
    }

    public static void printDeck(ArrayList<Card> deck, String tag){

        System.out.println(tag + ":");

        for(int i = 0; i < deck.size(); i++){
            System.out.print(deck.get(i) + " ");
            if((i + 1) % 13 == 0){
                System.out.println();
            }
        }

    }

    public static void shuffleDeck(ArrayList<Card> deck){

        for(int i = 0; i < deck.size(); i++){
            int r = (int)(Math.random() * deck.size());
            Card temp = deck.get(i);
            deck.set(i, deck.get(r));
            deck.set(r, temp);
        }
    }

    public static void returnCard(Gambler name, ArrayList<Card> deck){
        while(name.getHand().getCards().length > 0){
            Card returnCard = name.getHand().removeCard(0);
            deck.add(returnCard);
        }
    }

}
