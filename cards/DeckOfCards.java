package com.bridgelabz.stockmanagement.cards;

public class DeckOfCards {
    public static void main(String[] args) {
        deckOfCards();
    }

    public static void deckOfCards() {
        int[] deck = new int[52];
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"};
//        String[][] ranksAndSuits={{"Clubs", "Diamonds", "Hearts", "Spades"},
//                {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}};
        int noOfPlayers = 4;
        int card = (int) (Math.random() * deck.length);

        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        for (int i = 0; i < deck.length; i++) {
            int temp = deck[i];
            deck[i] = deck[card];
            deck[card] = temp;
        }

        for (int i = 1; i <= noOfPlayers; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card for the palyer " + i + " is : " + " with rank " + rank + " and suit of " + suit);
        }
    }
}
