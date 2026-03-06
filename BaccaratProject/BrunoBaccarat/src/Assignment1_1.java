import cards.Card;

public class Assignment1_1 {

    public static void main(String[] args) {
        
        Card[] deck = new Card[52];

        for(int i = 0; i < deck.length; i++) {
            deck[i] = new Card(i + 1);
        }

        System.out.println("My deck:");

        for(int i = 0; i < deck.length; i ++){
            System.out.print(deck[i] + " ");

            if((i + 1) % 13 == 0) {
                System.out.println();
            }
        }

        shuffle(deck);

        System.out.println("\nShuffled Deck: ");

        for(int i = 0; i < deck.length; i++){
            System.out.print(deck[i] + " ");

            if((i + 1) % 13 == 0){
                System.out.println();
            }
        }

        Card[] player1Hand = new Card[5];
        Card[] player2Hand = new Card[5];

        for(int i = 0; i < player1Hand.length; i++){

            player1Hand[i] = deck[i * 2];
            player2Hand[i] = deck[i * 2 + 1];
        }

        System.out.print("\nBruno's cards: ");

        for(int i = 0; i < player1Hand.length; i++){
            System.out.print(player1Hand[i].toString() + " ");
        }

        System.out.print("\nKevin's cards: ");

        for(int i = 0; i < player2Hand.length; i++){
            System.out.print(player2Hand[i].toString() + " ");
        }

        System.out.println();

        System.out.println("\nThe number of cards created is " + deck[0].getCardsCreated() + ".");
    }

    //Deck Shuffle Method 

        public static void shuffle(Card[] deck){

            for(int i = 0; i < deck.length; i++) {
                int r = (int)(Math.random() * deck.length);

                Card temp = deck[i];
                deck[i] = deck[r];
                deck[r] = temp;
             }
        }

}
