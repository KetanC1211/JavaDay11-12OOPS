package com.bridgelabz;

public class DeckOfCards {
    public static void main(String[] args) {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // initialize deck
        int n = suit.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length*i + j] =  ranks[i] + " of " + suit[j];
            }
        }

        // shuffle
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];	
            deck[i] = temp;
        }

//        // print shuffled deck
//        for (int i = 0; i < n; i++) {
//            System.out.println(deck[i]);
//        }
        
        String playerRecieved [][] = new String [4][9];
        int j=0;
        for (int playerNo = 0;playerNo<4;playerNo++) {
        	System.out.println("For Player"+(playerNo+1));
        	for(int cardsRecieved = 0; cardsRecieved<9; cardsRecieved++) {
        		playerRecieved [playerNo][cardsRecieved] = deck[j];
        		System.out.println(playerRecieved [playerNo][cardsRecieved]);
        		j++;
        	}
        	System.out.println("");
        }
    }
}
