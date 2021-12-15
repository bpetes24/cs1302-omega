package cs1302.omega;

import cs1302.game.PongGame;
import cs1302.game.GameBar;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class is a JavaFX {@link Application} for running a {@link PongGame} object
 * representing a game of "Pong!".
 */
public class OmegaApp extends Application {

    /**
     * Constructs an {@code OmegaApp} object. This default (i.e., no argument)
     * constructor is executed in Step 2 of the JavaFX Application Life-Cycle.
     */
    public OmegaApp() {} //OmegaApp

    /** {@inheritDoc} */
    @Override
    public void start(Stage stage) {

        PongGame game = new PongGame();
        GameBar gameBar = new GameBar(game);

        // setup scene
        VBox root = new VBox(gameBar, game);
        Scene scene = new Scene(root);

        // setup stage
        stage.setTitle("OmegaApp: Pong!");
        stage.setScene(scene);
        stage.setOnCloseRequest(event -> Platform.exit());
        stage.sizeToScene();
        stage.show();

        // play the game
        game.play();

    } // start

} //class
