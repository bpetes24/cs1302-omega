package cs1302.game;

import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

/**
 * This class is a {@link Rectangle} representing a player in a
 * game of "Pong!".
 */
public class Player extends Rectangle {

    private static final int PLAYER_HEIGHT = 15; //The player's height
    private static final int PLAYER_WIDTH = 100; //The player's width

    private Game game; //The game for this object

    /**
     * Constructs a {@code Player} object.
     *
     * @param game - the game for this object
     */
    public Player(Game game) {
        super(PLAYER_WIDTH, PLAYER_HEIGHT, Color.RED);
        this.game = game;
    } //Player

} //class
