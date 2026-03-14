package hand;

import java.util.ArrayList;
import cards.Card;

public abstract class Hand {

    protected ArrayList<Card> cards; 
    public abstract void evaluateHand();
    public abstract  int[] comparehands(Hand BaccaratHand, Hand PokerHand);
    public abstract String showAttributes();

    public Hand(){

        cards = new ArrayList<Card>();

    }


    public void addCard(Card dealtCard){

        cards.add(dealtCard);
    }

    public void addCard(Card[] dealtCards){ // adds an entire array to the hand. If someone gives me 3 cards,
                                            // Then the loop iterates 3 times and put a card in each index.
        for(int i = 0; i < dealtCards.length; i++){
            cards.add(dealtCards[i]);
        }

    }

    public void setCard(Card dealtCard, int index){

        cards.set(index, dealtCard);

    }

    public Card getCard(int index){

        return cards.get(index);

    }

    public Card removeCard(int index){

        return cards.remove(index);

    }

    public Card[] getCards(){

        Card[] cardArray = new Card[cards.size()];
        cards.toArray(cardArray);
        return cardArray;

    }

    public String showAttributes(){

        String output = "Hand Faces: ";

        for(int i = 0; i < cards.size(); i++){
                output += cards.get(i).getFace() + " ";
            }

        return output;

    }

    @Override
    public String toString(){

        String output = "";

        for(int i = 0; i < cards.size(); i++){
        
                output += cards.get(i) + " ";
            
        }

        return output;

    }
}
