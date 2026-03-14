package gambler;

import hand.Hand;

public class Gambler {

    private final String id; //Same idea as to why this has no setter. It is immutable, it will not change after being assigned
    private final String name; //Same as above 
    private int bank;
    private Hand hand;

    public Gambler(String id, String name, int bank){

        /* this.id = id; 
        this.name = name;
        this.bank = bank;  */ //This constructor does the same as the one below. So we can call the constructor below in this one as: 
        this(id, name, bank, null); //null to tell Java that here we don't expect a hand

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
