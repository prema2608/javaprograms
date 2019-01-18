package com.bridgelabz.oopsprograms;

public class DeckOfCards {

	public static void main(String[] args) {

		String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		// initialize deck
		int n = SUITS.length * RANKS.length;
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}

		// shuffle
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		// print shuffled deck
		System.out.println("Total deck of cards: " + deck.length);
		for (int i = 0; i < 4; i++) {
			System.out.println("--------person " + (i + 1) + "-----------");
			for (int j = 0; j < 9; j++) {
				System.out.println(deck[i + j * 4] + " (card " + (i + j * 4) + ")");
			}
			System.out.println();
		}

	}
}






























































//
//		String[] cardsType ={"club","spade","heart","diamond"};
//		String [] cardValue = {"Ace","2","3","4","5","6","7","8","9","10","King", "Queen", "Jack" };
//
//		List<String> cards = new ArrayList<String>();
//		for(int i=0;i<=(cardsType.length)-1;i++){
//			for(int j=0;j<=(cardValue.length)-1;j++){
//				cards.add(cardValue[j]+ " " +" " +cardsType[i]  ) ;
//			}
//		}
//
//		Collections.shuffle(cards);
//		System.out.print(" The number of cards within:" + cards.size() +"\n");
//
//
//		for(int l=0;l< cards.size();l++){
//			System.out.print( cards.get(l)+"\n") ;
//		}    
