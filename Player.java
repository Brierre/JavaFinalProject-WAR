package finalProjectJava;

import java.util.List;

public class Player {
	protected List<Card> hand;
	private int score;
	private String name;
	Card card = new Card();
	
	//methods
	public void incrementScore(Player p1, Player p2, int i) {
		i = 1;
		this.score += i; //adding int i because in a future version of the game, if there's a war, we will have more points to give than one 
		//int temp = this.score; //used for testing
		System.out.println("Score: " + p1.getScore() + " : " + p2.getScore());
		System.out.println();
	}
	
	public int flip() { 						//flip the players card
		Card card = hand.get(0);
		System.out.println(card.toString());
		int value = card.getValue(); 			//value of the current card being flipped
		//System.out.print(value);
		
		hand.remove(0);							//remove the card from play

		return value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
		System.out.println("Thank you, " + name + ".");
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public List<Card> getHand() {
		
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
}
