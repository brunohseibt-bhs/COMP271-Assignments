package cards;

public class Card {

    private final int cardNumber;
    private String face;
    private String suit;
    private int suitIndex; 
    private String color;
    private int cardRank;
    private int points;
    private String cardImage;
    private static int cardsCreated;
    

    public Card(int cardNumber){
        
        this.cardNumber = cardNumber;
        cardsCreated++;
        createCard();

    }

    private void createCard(){

    // card rank 

    cardRank = (cardNumber - 1) % 13 + 1; 

    // suit Index

    suitIndex = (cardNumber - 1) / 13;

    // suit 

    String[] suits = {"s", "h", "d", "c"};
    suit = suits[suitIndex];

    // face 

    String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
    face = faces[cardRank - 1];

    // color
    if (suit.equals("h") || suit.equals("d")){
        color = "red";
    } else {
        color = "black";
    }

    // image 

    cardImage = String.valueOf(cardNumber) + ".png";

    // points

    points = otherMethods(cardRank);
        
    }

    private int otherMethods(int rank ){
        
        if (rank == 1) 
            return 1;
        if (rank >= 2 && rank <= 9)
            return rank;
        return 0;
    }


    public String toString(){
        return face + suit;
    }

    public int getCardNumber(){
        return cardNumber;
    }

    public String getFace(){
        return face; 
    }

    public String getSuit(){
        return suit;
    }

    public int getSuitIndex(){
        return suitIndex;
    }

    public String getColor(){
        return color;
    }

    public int getCardRank(){
        return cardRank;
    }

    public int getPoints(){
        return points;
    }

    public String getCardImage(){
        return cardImage;
    }

    public static int getCardsCreated(){
        return cardsCreated;
    }





}
