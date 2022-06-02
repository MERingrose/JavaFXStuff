import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TextSlider extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // instantiate VBox, Scene objects
        VBox root = new VBox();
        Scene scene = new Scene(root, 400, 100);

        // isntantiate slider and set the width
        Slider slider = new Slider(20, 48, 14);
        slider.setMaxWidth(200);

        // instantiate a text object
        Text text = new Text("Slava Ukraini!");

        // bind the font property of the Text object to a created Bindings object from
        // the value of the
        // slider as a new Font object
        text.fontProperty().bind(
                Bindings.createObjectBinding(() -> new Font(slider.valueProperty().get()),
                        slider.valueProperty()));

        // add the text and the slider to the VBox and set alignment and spacing
        root.getChildren().addAll(text, slider);
        root.setSpacing(20);
        root.setAlignment(Pos.BOTTOM_CENTER);

        // set the title, the scene and show.
        stage.setTitle("Text Size Slider");
        stage.setScene(scene);
        stage.show();

    };

    public static void main(String[] args) {
        launch(args);
    }

}
