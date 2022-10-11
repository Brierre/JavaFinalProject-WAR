package finalProjectJava;
/*
 * Instantiate Deck and two Players
 * call shuffle method on the deck
 * Iterate 52 times, calling the Draw method on the other player each iteration
 * Iterate 26 times and call the flip method for each player
 * compare the value of each card returned by flip
 * call the incrementScore method on the winning player of each flip
 * After the loop is over, compare the final score and declare a winner
 * print the winner--p1, p2, or draw
 * 
 */

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
//		Card card = new Card(6, 'S');
//		System.out.println(card.toString());

//		Card card2 = new Card(13, 'D');
//		System.out.println(card2.toString());
		Scanner scanner = new Scanner(System.in);
		Deck newDeck = new Deck(); //builds a standard deck of 52 cards
		
		Player p1 = new Player();
		System.out.println("Player 1, please enter your name: ");
		String name = scanner.next();
		p1.setName(name);
		
		Player p2 = new Player();
		System.out.println("Player 2, please enter your name: ");
		name = scanner.next();
		p2.setName(name);
			
		System.out.println("Let the games begin.");
		System.out.println();
		
		//deals 26 cards from newDeck to each player
		newDeck.dealToPlayers(p1, p2); //this method combines shuffling and dealing
		for (int i = 0; i < 26; i++) {
			int p1val = p1.flip();
			int p2val = p2.flip();
			if (p1val == p2val) {
				System.out.println("WAR!!!");
				System.out.println();
			} else if (p1val > p2val) {
				p1.incrementScore(p1,p2,1);
			} else {
				p2.incrementScore(p1,p2,1);
			}
		}
		if (p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + " is the winner.");
		} else if (p2.getScore() > p1.getScore()) {
			System.out.println(p2.getName() + " is the winner.");
		} else {
			System.out.println("This battle may have ended in a draw, but the war is far from over!");
		}
		scanner.close();
	}

}

