package cs1302.game;

import javafx.geometry.Bounds;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

/**
 * This class is a {@link Circle} representing the game ball
 * used in a game of "Pong!".
 */
public class Ball extends Circle {

    private Game game;       //Game containing this object
    private int ballXSpeed;  //Change in x per update
    private int ballYSpeed;  //Change in y per update

    /**
     * Constructs a {@code Ball} object.
     *
     * @param game - parent game
     */
    public Ball(Game game) {
        super(7.5, Color.WHITE);
        this.game = game;
        this.ballXSpeed = 1;
        this.ballYSpeed = 1;
    } //Ball

    /**
     * Updates the position of the ball.
     */
    public void update() {
        Bounds ballBounds = getBoundsInParent();
        Bounds gameBounds = game.getGameBounds();
        if (ballBounds.getMaxX() > gameBounds.getMaxX()) {
            ballXSpeed *= -1.0;
        } else if (ballBounds.getMinX() < gameBounds.getMinX()) {
            ballXSpeed *= -1.0;
        } //if
        setCenterX(getCenterX() + ballXSpeed);
    } //update

} //class
