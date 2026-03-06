package gambler;

import hand.Hand;

public class Gambler {

    private String id;
    private String name;
    private int bank;
    private Hand hand;

    public Gambler(String id, String name, int bank){

        this.id = id; 
        this.name = name;
        this.bank = bank; 

    }

    public Gambler(String id, String name, int bank, Hand hand){

        this.id = id;
        this.name = name;
        this.bank = bank;
        this.hand = hand;

    }

    public String getName(){

        return name;

    }

    public String getId(){

        return id;
    }

    public int getBank(){

        return bank;
    }

    public Hand getHand(){

        return hand;
    }

    public void setBank(int bank){

        this.bank = bank;
        
    }




}
