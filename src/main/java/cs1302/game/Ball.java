package cs1302.game;

import javafx.geometry.Bounds;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

/**
 * This class is a {@link Circle} representing the game ball
 * used in a game of "Pong!".
 */
public class Ball extends Circle {

    private static final double BALL_R = 7.5; //Radius/size of the ball

    private Game game; //Game containing this object

    private Player playerOne; //Player one of the game
    private Player playerTwo; //Player two of the game

    private int ballXSpeed; //Change in x per update
    private int ballYSpeed; //Change in y per update

    /**
     * Constructs a {@code Ball} object.
     *
     * @param game - parent game
     */
    public Ball(Game game, Player playerOne, Player playerTwo) {
        super(BALL_R, Color.WHITE);
        this.game = game;
        //Sets players
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;

        //Sets ball speeds
        this.ballXSpeed = 1;
        this.ballYSpeed = 1;
    } //Ball

    /**
     * Updates the position of the ball.
     */
    public void update() {
        Bounds ballBounds = getBoundsInParent();
        Bounds gameBounds = game.getGameBounds();
        double playerOneXPos = playerOne.getX();
        double playerOneYPos = playerOne.getY();
        double playerTwoXPos = playerTwo.getX();
        double playerTwoYPos = playerTwo.getY();

        //If the ball hits the game's boundaries, then it bounces off at the same speed.
        if (ballBounds.getMaxX() > gameBounds.getMaxX()) {
            ballXSpeed *= -1.0;
        } else if (ballBounds.getMinX() < gameBounds.getMinX()) {
            ballXSpeed *= -1.0;
        } //if

        //If the ball hits a player, then it bounces off a greater speed.
        if (((ballBounds.getMaxY() > playerOneYPos) &&
        ballBounds.getMaxX() >= playerOneXPos &&
        ballBounds.getMaxX() <= playerOneXPos + playerOne.getWidth())) {
            ballXSpeed *= -1.0;
            ballYSpeed *= -1.0;
        } else if (((ballBounds.getMinY() < playerTwoYPos + playerOne.getHeight()) &&
        ballBounds.getMinX() >= playerTwoXPos &&
        ballBounds.getMinX() <= playerTwoXPos + playerTwo.getWidth())) {
            ballXSpeed *= -1.0;
            ballYSpeed *= -1.0;
        } //if
        setCenterY(getCenterY() + ballYSpeed);
    } //update

    /**
     * Returns true if the specified player has scored (i.e., the ball passes the
     * opposing player does not hit the ball back).
     *
      * @return true if the player scored a point
     */
    /*
    public boolean isScored() {
        double playerOneYPos = playerOne.getY();
        double playerTwoYPos = playerTwo.getY();
        if (ballBounds.getMaxY() < playerOneYPos + playerOne.getHeight()) {
            return true;
        } else if (ballBounds.getMinY() > playerTwoYPos - playerOne.getHeight()) {
            return true;
        } //if
        return false;
    } //isScored
    */
    /**
     * Sets the ball position at the beginning of each round as well as its
     * initial direction, which alternates from one side to another based
     * on whose turn it is.
     */
    public void setBall(boolean whoseTurn) {
        throw new UnsupportedOperationException("Not yet implemented");
    } //setBall
} //class
