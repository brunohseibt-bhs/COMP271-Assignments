import cards.Card;
import gambler.Gambler;
import hand.Hand; 

public class Assignment1_2 {

    public static void main(String[] args) {
        
        Card[] deck = new Card[52];

        for(int i = 0; i < deck.length; i++){
            deck[i] = new Card(i + 1);
        }

        printDeck(deck, "Deck Before Shuffle");
        System.out.println();
        shuffleDeck(deck);
        printDeck(deck, "Shuffled Deck");
        System.out.println();

        Gambler Bruno = new Gambler("1", "Bruno", 1000, new Hand(5));
        Gambler Kevin = new Gambler("2", "Kevin", 1500, new Hand(5));

        for(int i = 0; i < 5; i++){

            Bruno.getHand().addCard(deck[i * 2]);
            Kevin.getHand().addCard(deck[i * 2 + 1]);
        }

        System.out.print("\n" + Bruno.getName() + "'s Hand: ");
        System.out.println(Bruno.getHand());
        System.out.println(Bruno.getHand().showAttributes());

        System.out.print("\n" + Kevin.getName() + "'s Hand: ");
        System.out.println(Kevin.getHand());
        System.out.println(Kevin.getHand().showAttributes());

        System.out.println("\nThe number of cards created is " + Card.getCardsCreated());

    }

    public static void printDeck(Card[] deck, String tag){

        System.out.println(tag + ":");

        for(int i = 0; i < deck.length; i++){
            System.out.print(deck[i] + " ");
            if((i + 1) % 13 == 0){
                System.out.println();
            }
        }

    }

    public static void shuffleDeck(Card[] deck){

        for(int i = 0; i < deck.length; i++){
            int r = (int)(Math.random() * deck.length);

            Card temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp; 
        }
    }

}
