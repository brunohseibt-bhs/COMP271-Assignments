package hand;

import cardtools.Solver;

import java.util.ArrayList;
import cardtools.PokerSolver;

public class PokerHand extends Hand implements Solver{

    private String handDescr;
    private int handScore;
    private int handRank;
    private int[] altCards;

    public PokerHand(){

        super();

    }

     @Override
    public String showAttributes(){

        String output = "Hand Suits: ";

        for(int i = 0; i < cards.size(); i++){
                output += cards.get(i).getSuit() + " ";
            }

        return output;

    }

    public void evaluateHand(){

        PokerSolver.evaluateHand(this);

    }

    public int[] compareHands(Hand... var1){

        PokerHand[] alternateHand = new PokerHand[var1.length + 1];
        alternateHand[0] = this;

        for(int i = 0; i < var1.length; i++){
            alternateHand[i+1] = (PokerHand) var1[i];

        }

        int[] result = PokerSolver.evaluatePokerGame(alternateHand);
        return result; 
    }

    public String getHandDescr() {
        return handDescr;
    }

    public void setHandDescr(String handDescr) {
        this.handDescr = handDescr;
    }

    public int getHandScore() {
        return handScore;
    }

    public void setHandScore(int handScore) {
        this.handScore = handScore;
    }

    public int getHandRank() {
        return handRank;
    }

    public void setHandRank(int handRank) {
        this.handRank = handRank;
    }

    public int[] getAltCards() {
        return altCards;
    }

    public void setAltCards(int[] altCards) {
        this.altCards = altCards;
    }
}
