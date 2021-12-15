package cs1302.game;

import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;

/**
 * This class is a {@link HBox} object containing the score
 * in a game of "Pong!" as well as additional instructions
 * for how to play the game.
 */
public class GameBar extends HBox {

    private HBox scoreBoxOne;  //Score box for player one
    private HBox scoreBoxTwo;  //Score box for player two

    /**
     * Constructs a {@code GameBar} object.
     */
    public GameBar() {
        super(4);
        //Initialized default score and box for player one
        this.scoreBoxOne = new HBox(2);
        //Initialized default score and box for player two
        this.scoreBoxTwo = new HBox(2);

        //Sets children alignment and adds them to scene graph
        this.getChildren().addAll(scoreBoxOne, scoreBoxTwo);
    } //GameBar

} //class
