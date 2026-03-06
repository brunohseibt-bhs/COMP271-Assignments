package hand;

public class PokerHand extends Hand{

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
