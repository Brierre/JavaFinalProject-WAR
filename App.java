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
 */

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
//		Card card = new Card(6, 'S');
//		System.out.println(card.toString());
		
		Scanner scanner = new Scanner(System.in);
		//a) Instantiate a Deck and two Players
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
		
		//b) using a traditional for loop, iterate 52x calling Draw method on the other player each iteration using the Deck you instantiated
		//deal 26 cards from newDeck to each player
		newDeck.dealToPlayers(p1, p2); //this method combines shuffling and dealing
		
		//c) using a traditional for loop, iterate 26x and call the flip() method for each player
		for (int i = 0; i < 26; i++) {
			System.out.print("\n" + p1.getName() + "'s card: ");
			int p1val = p1.flip();
			System.out.print(p2.getName() + "'s card: ");
			int p2val = p2.flip();
		//d) compare the value of each card returned by the two players' flip methods. Call incrementScore() on the winner
		//e) after the loop, compare the final score from each player (this is done from within incrementScore())
			if (p1val == p2val) {
				System.out.println("\nWAR!!!");
				System.out.println();
			} else if (p1val > p2val) {
				System.out.println("\nThe winner of this round is " + p1.getName());
				p1.incrementScore(p1,p2,1);
			} else {
				System.out.println("\nThe winner of this round is " + p2.getName());
				p2.incrementScore(p1,p2,1);
			}
			
		}
		//f) print the final score of each player and either Player 1, Player 2, or Draw depending on which score is higher or they are both the same
		System.out.println("\nFinal Score: " + p1.getName() + ":" + p1.getScore() + ", " + p2.getName() + ":" + p2.getScore());
		if (p1.getScore() > p2.getScore()) {
			System.out.println(p1.getName() + " wins the war!");
		} else if (p2.getScore() > p1.getScore()) {
			System.out.println(p2.getName() + " wins the war!");
		} else {
			System.out.println("This battle may have ended in a draw, but the war is far from over!");
		}
		scanner.close();
	}

}

