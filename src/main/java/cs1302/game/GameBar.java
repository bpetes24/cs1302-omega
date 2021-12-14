package cs1302.game;

import javafx.scene.text.Text;
import javafx.scene.layout.HBox;

/**
 * This class is a {@link HBox} object containing the score
 * in a game of "Pong!" as well as additional instructions
 * for how to play the game.
 */
public class GameBar extends HBox {

    private HBox scoreBoxOne;  //Score box for player one
    private HBox scoreBoxTwo;  //Score box for player two
    private Text howToPlay;    //Instructions for how to play the game
    protected int scoreOne;    //Score for player one
    protected int scoreTwo;    //Score for player two

    /**
     * Constructs a {@code GameBar} object.
     */
    public GameBar() {
        super(4);
        this.scoreBoxOne = new HBox();
        this.scoreOne = 0;
    } //GameBar

} //class
