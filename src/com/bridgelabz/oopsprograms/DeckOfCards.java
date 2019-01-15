package com.bridgelabz.oopsprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class DeckOfCards
{

	public static void main(String[] args) {

		String[] cardsType ={"club","spade","heart","diamond"};
		String [] cardValue = {"Ace","2","3","4","5","6","7","8","9","10","King", "Queen", "Jack" };

		List<String> cards = new ArrayList<String>();
		for(int i=0;i<=(cardsType.length)-1;i++){
			for(int j=0;j<=(cardValue.length)-1;j++){
				cards.add(cardValue[j]+ " " +" " +cardsType[i]  ) ;
			}
		}

		Collections.shuffle(cards);
		System.out.print(" The number of cards within:" + cards.size() +"\n");


		for(int l=0;l< cards.size();l++){
			System.out.print( cards.get(l)+"\n") ;
		}    
	}
}


