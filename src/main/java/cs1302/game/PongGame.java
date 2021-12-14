package cs1302.game;

import java.util.logging.Level;

import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.event.Event;
import javafx.event.ActionEvent;
import javafx.util.Duration;
import javafx.scene.robot.Robot;
import javafx.scene.control.Button;
import javafx.scene.control.Separator;

/**
 * This class is a {@link Game} for building a single-player "Pong!" game.
 *
 * <p>
 * The rules of "Pong!" are as follows:
 * - There are two players on each side of the game board/table. From the
 * middle of the board, a ball is served to one player at the beginning of
 * each round, starting the point.
 * - Both players try to block the ball from getting past them, hitting the
 * ball back to each other's side until one player misses it. The player
 * who does not miss the ball receives a point.
 * - The first one of the players to reach the specified point goal (the
 * default is ten) wins the game.
 *
 * <p>
 * When the game is over, the user is prompted with a 'Game Over!' message
 * along with the final score. The user has the option of playing another
 * game or exiting the application entirely.
 */
public class PongGame extends Game {

    private static final int width = 800;
    private static final int height = 600;
    private static final int PLAYER_HEIGHT = 15;
    private static final int PLAYER_WIDTH = 100;
    private static final double BALL_R = 15;

    protected Rectangle playerOne; //Represents the user/player
    protected Rectangle playerTwo; //Represents the computer/opponent
    protected Circle ball;         //Represents the ball to be played
    private int playerOneScore;    //Represents player one's score
    private int playerTwoScore;    //Represents player two's score
    private int scoreToWin;        //Represents the score needed to win

    /**
     * Constructs a {@code PongGame} object.
     *
     * @param width - scene width
     * @param height - scene height
     */
    public PongGame() {
        super(width, height, 60);
        setLogLevel(Level.INFO);
        this.playerOne = new Rectangle(PLAYER_WIDTH, PLAYER_HEIGHT, Color.WHITE);
        this.playerTwo = new Rectangle(PLAYER_WIDTH, PLAYER_HEIGHT, Color.WHITE);
        this.ball = new Circle(BALL_R, Color.WHITE);
        this.playerOneScore = 0;
        this.playerTwoScore = 0;
        this.scoreToWin = 10;
    } //PongGame

    /**
     * Initializes the scene graph for the {@code PongGame} object.
     *
     * {@inheritDoc}
     */
    @Override
    protected void init() {
        getChildren().addAll(playerOne, playerTwo, ball);
        //Setup player one
        playerOne.setX(width / 2);
        playerOne.setY(height - PLAYER_HEIGHT);
        //Setup player two
        playerTwo.setX(width / 2);
        playerTwo.setY(0);
    } //init

    /**
     * Updates the scene graph/game board with player positions.
     *
     * {@inheritDoc}
     */
    @Override
    protected void update() {
        throw new UnsupportedOperationException("Not yet implemented");
    } //update

    /**
     * Returns true if a player has won the game (i.e., their score is
     * equal to the score needed to win).
     *
     * @param player - the player that has won the game
     * @return true - if a player has won the game
     */
    protected boolean isWon(Rectangle player) {
        throw new UnsupportedOperationException("Not yet implemented");
    } //isWon

    /**
     * Returns player one's score.
     *
     * @return playerOneScore - player one's current score
     */
    public int getPlayerOneScore() {
        return playerOneScore;
    } //getPlayerOneScore

    /**
     * Sets player one's score to a new score.
     *
     * @param score - player one's new score
     */
    public void setPlayerOneScore(int score) {
        this.playerOneScore = score;
    } //setPlayerOneScore

    /**
     * Returns player two's score.
     *
     * @return playerTwoScore - player two's current score
     */
    public int getPlayerTwoScore() {
        return playerTwoScore;
    } //getPlayerTwoScore

    /**
     * Sets player two's score to a new score.
     *
     * @param score - player two's new score
     */
    public void setPlayerTwoScore(int score) {
        this.playerTwoScore = score;
    } //setPlayerTwoScore

} //class
