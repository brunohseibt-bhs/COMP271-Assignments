import java.util.ArrayList;

public class Lab11_2 {

	final static String[] CARDS = {
			"As", "2s", "3s", "4s", "5s", "6s", "7s", "8s", "9s", "Ts", "Js", "Qs", "Ks",	
			"Ah", "2h", "3h", "4h", "5h", "6h", "7h", "8h", "9h", "Th", "Jh", "Qh", "Kh",	
			"Ad", "2d", "3d", "4d", "5d", "6d", "7d", "8d", "9d", "Td", "Jd", "Qd", "Kd",	
			"Ac", "2c", "3c", "4c", "5c", "6c", "7c", "8c", "9c", "Tc", "Jc", "Qc", "Kc",	
		};
	
	public static void main(String[] args) {
		
		//Instantiate the array list(3)
		
		//Populate the array list (4)
		
		//Print the deck (5)
		
		//Create a player String array (6)
		
		//Deal 5 random cards to player be sure to remove from the deck (7)

		//Print the player's cards (8)
		
		//Print the deck again (9)
		

	}

	//Method to populate the ArrayList
	public static void populateArrayList(ArrayList<String> stringList) {
		for(int i=0; i<CARDS.length; i++) {
			stringList.add(CARDS[i]);
		}
	}
	
	//Method to print the deck
	public static void printDeck(ArrayList<String> stringList) {
		for(int i=0; i<stringList.size(); i++) {
			if(i!=0 && i%13==0) {
				System.out.println();
			}
			
			System.out.print(stringList.get(i) + " ");
		}
		
	}
}
