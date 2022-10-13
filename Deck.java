package finalProjectJava;

import java.util.ArrayList;
import java.util.List;


public class Deck {
	
	//global variables
	List<Card> cards = new ArrayList<>();
	
	//constructors
	Deck() {
		buildDeck();
	}
	
	//methods	
	public void buildDeck() { 												//does not return anything, it just creates the cards
																			//and puts the cards into an arraylist called cards

		char[] suits = {'C','D','H','S'};
	
		for (char suit : suits) { 											//each suit has 14 cards values 2 to 14
			for (int i = 2; i <= 14; i++) {
				int value = i;
				char name = suit;	
				Card card = new Card(value, name); 							//create the next card
				cards.add(card); 											//and add it to the arraylist
				//System.out.println(card); 								//test that all cards are being created
			}
		}
	}
	
	public void dealToPlayers(Player p1, Player p2) {
		List<ArrayList<Card>> decks = new ArrayList<ArrayList<Card>>(); 	//creates our list of lists
		ArrayList<Card> p1Deck = new ArrayList<Card>();						//creates first list in list
		ArrayList<Card> p2Deck = new ArrayList<Card>();						//creates second list in list
		decks.add(p1Deck);													//adds each deck to the main list
		decks.add(p2Deck);
		//System.out.println(cards); 										//make sure all 52 cards have been added to the initial deck before we start
		
		//loop through 52 times and add a random card to player decks, alternating deal
		//then remove that card from original arraylist (until the list is empty)
		for (int j = 0; j < 52; j++) {				
			int deal = (int) (Math.random() * cards.size());  				//randomly select a single index in this ArrayList
			Card nextCard = (cards.get(deal));								//this draws the card at the randomly selected index of the arraylist
			if (j % 2 == 0) { 												//if the card iteration is even
				p2Deck.add(nextCard);										//add the card to player 2's deck
				cards.remove(deal);											//remove the same card from the original deck so it cannot be selected again
				//System.out.println("Player 2 deck: " + p2Deck);			//testing cards being added to deck
			} else if (j % 2 == 1) {  										//but if card iteration is odd
				p1Deck.add(nextCard);										//add the card to player 1's deck
				cards.remove(deal);											//remove the same card from the original deck so it cannot be selected again
				//System.out.println("Player 1 deck: " + p1Deck); 			//testing cards being added to deck
			}
			//System.out.println("Original Deck now contains: " + cards); 	//testing to see that cards are being removed from original deck, not to be used again
		}
		p1.hand = p1Deck;
		p2.hand = p2Deck;
	}
	
}
