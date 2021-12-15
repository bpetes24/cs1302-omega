package cs1302.game;

import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * This class is a {@link HBox} object containing the score
 * in a game of "Pong!" as well as additional instructions
 * for how to play the game.
 */
public class GameBar extends HBox {

    private PongGame game;
    private HBox scoreBoxOne;  //Score box for player one
    private HBox scoreBoxTwo;  //Score box for player two
    protected Text scoreOne;   //Score for player one
    protected Text scoreTwo;   //Score for player two

    /**
     * Constructs a {@code GameBar} object.
     */
    public GameBar(PongGame game) {
        super();
        //Initialized default score and box for player one
        this.scoreBoxOne = new HBox();
        this.scoreOne = new Text("" + game.getPlayerOneScore());
        scoreOne.setTextAlignment(TextAlignment.CENTER);
        scoreBoxOne.getChildren().add(scoreOne);

        //Initialized default score and box for player two
        this.scoreBoxTwo = new HBox();
        this.scoreTwo = new Text("" + game.getPlayerTwoScore());
        scoreTwo.setTextAlignment(TextAlignment.CENTER);
        scoreBoxTwo.getChildren().add(scoreTwo);

        //Sets children alignment and adds them to scene graph
        this.getChildren().addAll(scoreBoxOne, scoreBoxTwo);
    } //GameBar

} //class
