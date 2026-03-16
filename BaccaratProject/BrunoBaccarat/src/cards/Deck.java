package cards;

import java.util.ArrayList;
import gambler.Gambler;
import hand.Hand;

public class Deck{

    private ArrayList<Card> cards;
    private ArrayList<Card> usedCards;
    private int deckSize;
    private int deckCount;
    private int cutCard;


    public Deck(int deckSize, int deckCount){

        this.deckSize = deckSize;
        this.deckCount = deckCount;
        cards = new ArrayList<Card>();
        usedCards = new ArrayList<Card>();

        for(int i = 0; i < deckCount; i++){
            for(int j = 0; j < 52; j++){
                cards.add(new Card(j + 1));
             }
        }

    }

    public void shuffleDeck(){

        for(int i = 0; i < cards.size(); i++){
            int r = (int)(Math.random() * cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(r));
            cards.set(r, temp);
        }

    }

    public void restack(){

        if(cards.size() < cutCard){
            restackDeck();
        }

    }

    public void restackDeck(){

       cards.addAll(usedCards); //adding all cards from usedCards into cards
       usedCards.clear(); //clears all inside an arrayList
       shuffleDeck();

    }

    public Card dealCard(int index){

        return cards.remove(index);

    }

    public Card getCard(int index){

        return cards.get(index);

    }

    public void discard(Card usedCard){

        usedCards.add(usedCard);

    }

    public void discardAll(Hand[] handObjs){

        

    }

    public void discardAll(Gambler[] players){

    }

    public Card[] getCards(){

    }

    public Card[] getUsedCards(){

    }

    public String toString(){

    }

    public int getDeckSize() {
        return deckSize;
    }

    public int getDeckCount() {
        return deckCount;
    }

    public int getCutCard() {
        return cutCard;
    }

     public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void setUsedCards(ArrayList<Card> usedCards) {
        this.usedCards = usedCards;
    }

    public void setDeckSize(int deckSize) {
        this.deckSize = deckSize;
    }

    public void setDeckCount(int deckCount) {
        this.deckCount = deckCount;
    }

    public void setCutCard(int cutCard) {
        this.cutCard = cutCard;
    }



}
