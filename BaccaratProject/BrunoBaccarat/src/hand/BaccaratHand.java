package hand;

public class BaccaratHand extends Hand{

    private String name;
    private int score;

    public BaccaratHand(String name){ //constructor always has to match class name 
        
        super(); //calls the parent's constructor so goes back to Hand class' constructor cards = new ArrayList<Card>();
        this.name = name;

    }

    @Override //polymorphism 
    public String showAttributes(){

        String output = "Hand Points: ";

        for(int i = 0; i < cards.size(); i++){
                output += cards.get(i).getPoints() + " ";
            }

        return output;

    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    

}
