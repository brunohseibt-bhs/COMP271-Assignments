package hand;

import cardtools.Solver;

public class BaccaratHand extends Hand implements Solver{

    private String name;
    private int score;

    public BaccaratHand(String name){ //constructor always has to match class name 
        
        super(); //calls the parent's constructor so goes back to Hand class' constructor cards = new ArrayList<Card>();
        this.name = name;

    }

    public void evaluateHand(){

        int scoreCounter = 0;

        for(int i = 0; i < cards.size(); i++){ 
            if(cards.get(i) != null){
                scoreCounter += cards.get(i).getPoints(); // Recall that scores cannot exceed 10. So 10 is 0, 11 is 1, 12 is 2, etc. 
            }
        }

        this.score = scoreCounter % 10;

    }

    public int[] compareHands(Hand... var1){

        int[] result = {0 , 0};
        int otherScore = ((BaccaratHand) var1[0]).getScore();

        if(this.score > otherScore){

            result[0] = 1;

        } else if(otherScore > this.score){

            result[1] = 1;

        } else {

            result[0] = 2;
            result[1] = 2;
    
        }
        
        return result;

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
