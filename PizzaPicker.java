import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * PizzaPicker.java
 * COMP 1231 - Computer Programming II
 * TRU ID: T00698437
 * 
 * @author Mark Ringrose
 * 
 *         Represents the stage that extends Application. Also holds Main and
 *         Launch methods.
 * 
 */
public class PizzaPicker extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // start method, declare new scene with a new PizzaPane object with height and
        // width
        Scene scene = new Scene(new PizzaPane(), 500, 200);

        // set the title, the scene and show the stage
        primaryStage.setTitle("Pizza Cost");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}