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

    protected Rectangle playerOne; //Represents the user/player
    protected Rectangle playerTwo; //Represents the computer/opponent
    protected Rectangle ball;        //Represents the ball to be played
    private int playerOneScore; //Represents player one's score
    private int playerTwoScore; //Represents player two's score
    private int scoreToWin;     //Represents the score needed to win

    /**
     * Constructs a {@code PongGame} object.
     *
     * @param width - scene width
     * @param height - scene height
     */
    public PongGame(int width, int height) {
        super(width, height, 60);
        setLogLevel(Level.INFO);
        this.playerOne = new Rectangle(10, 50);
        this.playerTwo = new Rectangle(10, 50);
        this.Ball = new Rectangle();
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
        throw new UnsupportedOperationException("Not yet implemented");
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

} //class
