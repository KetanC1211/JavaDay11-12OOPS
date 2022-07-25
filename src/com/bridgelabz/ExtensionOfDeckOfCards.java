package com.bridgelabz;

import java.util.Arrays;

public class ExtensionOfDeckOfCards {
	String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    int n = suit.length * ranks.length;
    String[] deck = new String[n];
    
    //create deck of cards
    public String [] createDeckOfCards() {
	    for (int i = 0; i < ranks.length; i++) {
	        for (int j = 0; j < suit.length; j++) {
	            deck[suit.length*i + j] = suit[j]+" of " +  ranks[i] ;
	        }
	    }
	    return deck;
    }
    
    //Shuffle deck of cards
    public String [] shuffleCards() {
    	createDeckOfCards();
    	for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];	
            deck[i] = temp;
         }
    	return deck;
    }
    
    public String [][] playerReceivedCards(int numOfPlayers, int cardsRecievedPerPlayer){
    	String playerRecieved [][] = new String [numOfPlayers][cardsRecievedPerPlayer];
    	if((numOfPlayers*cardsRecievedPerPlayer) <n) {
	    	shuffleCards();
	        int j=0;
	        for (int playerNo = 0;playerNo<numOfPlayers;playerNo++) {
	        	System.out.println("For Player"+(playerNo+1));
	        	for(int cardsRecieved = 0; cardsRecieved<cardsRecievedPerPlayer; cardsRecieved++) {
	        		playerRecieved [playerNo][cardsRecieved] = deck[j];
	        		System.out.println(playerRecieved [playerNo][cardsRecieved]);
	        		j++;
	        	}
	        	System.out.println("");
	        }
    	}
    	else {
    		System.out.println("Enter proper player and card details");
    		return playerRecieved = null ;
    	}
    	return playerRecieved;
    }   
    public void sortPlayerRecievedCards(String arr[][]) {
    	//Sorting player 1 card
    	String player1 [] = new String [9];
    	for (int j = 0; j < arr[0].length; j++) {
            player1[j]=arr[0][j];
    	}
    	Arrays.sort(player1);
    	System.out.println("Player 1 sorted cards");
    	for(int i =0;i<9;i++) {
    		System.out.println(player1[i]);
    	}
    	System.out.println("");
    	//Sorting player 2 cards 
    	String player2 [] = new String [9];
    	for (int j = 0; j < arr[1].length; j++) {
            player2[j]=arr[1][j];
    	}
    	Arrays.sort(player2);
    	System.out.println("Player2 sorted cards");
    	for(int i =0;i<9;i++) {
    		System.out.println(player2[i]);
    	}
    	System.out.println("");
    	//Sorting player 3 cards 
    	String player3 [] = new String [9];
    	for (int j = 0; j < arr[2].length; j++) {
            player3[j]=arr[2][j];
    	}
    	Arrays.sort(player3);
    	System.out.println("Player1 sorted cards");
    	for(int i =0;i<9;i++) {
    		System.out.println(player3[i]);
    	}
    	System.out.println("");
    	//Sorting player 4 cards 
    	String player4 [] = new String [9];
    	for (int j = 0; j < arr[3].length; j++) {
            player4[j]=arr[3][j];
    	}
    	Arrays.sort(player4);
    	System.out.println("Player1 sorted cards");
    	for(int i =0;i<9;i++) {
    		System.out.println(player4[i]);
    	}
        return ;
    }
	
	public static void main(String[] args) {
		ExtensionOfDeckOfCards game = new ExtensionOfDeckOfCards();
		String arr [][] = new String [4][9];
		arr = game.playerReceivedCards(4,9);
		game.sortPlayerRecievedCards(arr);
	}
}
