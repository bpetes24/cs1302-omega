package cs1302.game;

import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;

/**
 * This class is a {@link HBox} object containing the score
 * in a game of "Pong!" as well as additional instructions
 * for how to play the game.
 */
public class GameBar extends HBox {

    private HBox scoreBoxOne;  //Score box for player one
    private HBox scoreBoxTwo;  //Score box for player two
    protected int scoreOne;    //Score for player one
    private Text scoreOneText; //Score for player one as a string
    protected int scoreTwo;    //Score for player two
    private Text scoreTwoText; //Score for player two as a string

    /**
     * Constructs a {@code GameBar} object.
     */
    public GameBar() {
        super(4);
        //Initialized default score and box for player one
        this.scoreBoxOne = new HBox(2);
        this.scoreOne = 0;
        this.scoreOneText = new Text(" " + scoreOne + " ");
        scoreBoxOne.setAlignment(Pos.Center);
        scoreBoxOne.getChildren().add(scoreOneText);

        //Initialized default score and box for player two
        this.scoreBoxTwo = new HBox(2);
        this.scoreTwo = 0;
        this.scoreTwoText = new Text(" " + scoreTwo + " ");
        scoreBoxTwo.setAlignment(Pos.Center);
        scoreBoxTwo.getChildren().add(scoreTwoText);

        //Sets children alignment and adds them to scene graph
        this.setAlignment(Pos.Center);
        this.getChildren().addAll(scoreBoxOne, scoreBoxTwo);
    } //GameBar

    /**
     * Returns the score for player one.
     *
     * @return scoreOne - the score for player one
     */
    public int getScoreOne() {
        return scoreOne;
    } //getScoreOne

    /**
     * Sets the score for player one.
     *
     * @param score - the new score for player one
     */
    public void setScoreOne(int score) {
        this.scoreOne = score;
    } //setScoreOne

    /**
     * Gets the score for player two.
     *
     * @return scoreTwo - the score for player two
     */
    public int getScoreTwo() {
        return scoreTwo;
    } //getScoreTwo

    /**
     * Sets the score for player two.
     *
     * @param score - the new score for player two
     */
    public void setScoreTwo(int score) {
        this.scoreTwo = score;
    } //setScoreTwo

} //class
