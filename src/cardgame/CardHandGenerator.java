package cardgame;

import cardgame.Card.Rank;
import cardgame.Card.Color;
import java.util.Random;

/**
 * A class that models the Card Hand. A Card hand has an array of cards. 
 * How can you change the size of the hand?
 *
 * @author dancye, 2019.
 * @modified Paul Bonenfant Feb 2022
 * @modified Megha Patel 2023
 * @modified Tran Anh Thu Nguyen 2023
 */

public class CardHandGenerator {

    /**
     * Generates a hand of a given size
     */
    public static Card[] generateHand(int handSize) {
        
        // we'll use this to generate random numbers
        Random random = new Random();
        
        // let's get these lengths once
        int numRanks = Card.Rank.values().length;
        int numColors = Card.Color.values().length;
        
        // declare and initialize a hand of cards
        Card[] hand = new Card[handSize];
        
        for (int i = 0; i < handSize; i++) {
            
            //get a random color and rank
            Card.Color randomColor = Card.Color.values()[random.nextInt(numColors)];
            Card.Rank randomRank = Card.Rank.values()[random.nextInt(numRanks)];
            
            // create a card and add it to the hand
            Card card = new Card(randomColor, randomRank);        
            hand[i] = card; 
        }
        return hand;
    }
}
