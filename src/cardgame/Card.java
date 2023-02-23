package cardgame;

/**
 * Starter code for the Card class. To be used in Week 4.
 *
 * @author dancye, 2019
 * @modified Paul Bonenfant Feb 2022
 * @modified Megha Patel 2023
 * @modified Tran Anh Thu Nguyen 2023
 */

/**
 * The Card class represents a standard playing card with a color and a rank.
 * By using OO principle of inheritance, the code can be reused and extended to model different types of card games.
 * In this case, the Card class is used as a building block to create an Uno deck by extending it with additional properties.
 * By using inheritance, the original Card class can be reused and extended rather than starting from scratch every time.
 * Due to the use of an enumeration for the color and rank (color is suit in traditional game card), it allows for a clear 
 * and concise representation of the card's properties. 
 * @author Tran Anh Thu Nguyen
 */
public class Card {

    public enum Color {
        RED, YELLOW, GREEN, BLUE
    }

    public enum Rank {
        ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, SKIP, REVERSE, DRAW_TWO, WILDCARD, DRAWFOUR
    }
    
    private final Color color;
    private final Rank rank;

    public Card(Color color, Rank rank) {
        this.color = color;
        this.rank = rank;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Color getColor() {
        return this.color;
    }
}
