package finalProjectJava;
/*
 * This class will construct the basic cards 2-Ace in four suits
 * Need fields of value (2-14 for 2 to Ace)
 * name (Ace of Diamonds, Two of Hearts)
 * 
 * Need methods: Getters and Setters
 * describe(): we are using the toString() method for this rather than describe()
 * 
 * CONSTANT VARIABLES
 * public static final char CLUBS = 'C';
 * do for all suits (suit char value, DIAMONDS = 'D', HEARTS = 'H', SPADES = 'S')
 * public static final int JACK = 11;
 * do for all face cards (QUEEN = 12, KING = 13, ACE = 14)
 * use .toString() method to print the whole card name
 */

public class Card {
	
	//constant variables
	public static final char CLUBS = 'C';
	public static final char DIAMONDS = 'D';
	public static final char HEARTS = 'H';
	public static final char SPADES = 'S';
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int ACE = 14;
	
	//global variables
	private int value;
	private char name;

	//constructors
	Card() {
		this.setValue(value);
		this.setName(name);
	}

	Card(int value, char name) {
		this.value = value;
		this.name  = name;
	}
	

	//methods
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public char getName() {
		return this.name;
	}

	public void setName(char name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String whichCard = "";
		if (this.value == JACK) {
			whichCard += "Jack";
		} else if (this.value == QUEEN) {
			whichCard += "Queen";
		} else if (this.value == KING) {
			whichCard += "King";
		} else if (this.value == ACE) {
			whichCard += "Ace";
		} else if (this.value == 2) {
			whichCard += "Two";
		} else if (this.value == 3) {
			whichCard += "Three";
		} else if (this.value == 4) {
			whichCard += "Four";
		} else if (this.value == 5) {
			whichCard += "Five";
		} else if (this.value == 6) {
			whichCard += "Six";
		} else if (this.value == 7) {
			whichCard += "Seven";
		} else if (this.value == 8) {
			whichCard += "Eight";
		} else if (this.value == 9) {
			whichCard += "Nine";
		} else if (this.value == 10) {
			whichCard += "Ten";
		} else {
			whichCard += this.value;
		}
		
		whichCard += " of ";
		
		if (this.name == CLUBS) {
			whichCard += "Clubs";
		} else if (this.name == DIAMONDS) {
			whichCard += "Diamonds";
		} else if (this.name == HEARTS) {
			whichCard += "Hearts";
		} else if (name == SPADES) {
			whichCard += "Spades";
		}
	return whichCard;
	}
}
