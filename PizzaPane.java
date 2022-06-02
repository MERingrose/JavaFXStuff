import javafx.scene.layout.GridPane;
import java.text.NumberFormat;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * PizzaPane.java
 * COMP 1231 - Computer Programming II
 * TRU ID: T00698437
 * 
 * @author Mark Ringrose
 * 
 *         Represents a pizza ordering and pricing GUI system with checkboxes
 *         and automatically updating pizza totals.
 *         Extends VBox to stack a GridPane for the checkboxes and an HBox to
 *         have the total label and the pizza total.
 * 
 */

public class PizzaPane extends VBox {

    // declaring global varibale for the total, declaring Text, NumberFormat,
    // Font, and CheckBox objects
    private double total = 10.00;
    private Text totalText;
    private NumberFormat format = NumberFormat.getCurrencyInstance();
    private Font font1 = Font.font("Helvetica", FontWeight.BOLD, 30),
            font2 = Font.font("Helvetica", FontWeight.SEMI_BOLD, 16);
    private CheckBox xTraCheeCheckBox, pepCheckBox, sausagCheckBox, greenPepCheckBox, onionCheckBox, anchoCheckBox;

    public PizzaPane() {

        // gridPane for the checkboxes and their labels
        GridPane gridPane = new GridPane();
        gridPane.setVgap(5); // gap between checkboxes

        // HBox for the lower portion of the GUI with the "Pizza Label" and the total
        HBox totalPane = new HBox();
        totalPane.setSpacing(30); // aesthetic spacing

        // instantiating a Text object with the value of total and set the font
        totalText = new Text(String.valueOf(format.format(total)));
        totalText.setFont(font1);

        // create label and set the font
        Label totalLabel = new Label("Pizza Cost: ");
        totalLabel.setFont(font1);

        // instantiating all checkboxes with their labels, set font, and setOnAction
        xTraCheeCheckBox = new CheckBox("Extra Cheese");
        xTraCheeCheckBox.setFont(font2);
        xTraCheeCheckBox.setOnAction(this::processCheckBoxAction);

        pepCheckBox = new CheckBox("Pepperoni");
        pepCheckBox.setFont(font2);
        pepCheckBox.setOnAction(this::processCheckBoxAction);

        sausagCheckBox = new CheckBox("Sausage");
        sausagCheckBox.setFont(font2);
        sausagCheckBox.setOnAction(this::processCheckBoxAction);

        greenPepCheckBox = new CheckBox("Green Pepper");
        greenPepCheckBox.setFont(font2);
        greenPepCheckBox.setOnAction(this::processCheckBoxAction);

        onionCheckBox = new CheckBox("Onion");
        onionCheckBox.setFont(font2);
        onionCheckBox.setOnAction(this::processCheckBoxAction);

        anchoCheckBox = new CheckBox("Anchovies");
        anchoCheckBox.setFont(font2);
        anchoCheckBox.setOnAction(this::processCheckBoxAction);

        // add elements to "totalPane" and set alignment
        totalPane.getChildren().addAll(totalLabel, totalText);
        totalPane.setAlignment(Pos.CENTER);

        // set alignment and gap for gridPane
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(50);

        // add all checkboxed to the gridPane
        gridPane.add(xTraCheeCheckBox, 0, 0);
        gridPane.add(pepCheckBox, 0, 1);
        gridPane.add(sausagCheckBox, 0, 2);
        gridPane.add(greenPepCheckBox, 1, 0);
        gridPane.add(onionCheckBox, 1, 1);
        gridPane.add(anchoCheckBox, 1, 2);

        // set style, vertical centering, and add gridPane and totalPane
        setVgrow(totalPane, Priority.ALWAYS);
        setVgrow(gridPane, Priority.ALWAYS);
        getChildren().addAll(gridPane, totalPane);
        setStyle("-fx-background-color: Beige");

    }

    public void processCheckBoxAction(ActionEvent event) {

        // reset total to base cost
        total = 10.00;

        // if any of the checkboxes are selected add 50 cents
        if (xTraCheeCheckBox.isSelected()) {
            total += 0.5;
        }

        if (pepCheckBox.isSelected()) {
            total += 0.5;
        }

        if (sausagCheckBox.isSelected()) {
            total += 0.5;
        }

        if (greenPepCheckBox.isSelected()) {
            total += 0.5;
        }

        if (onionCheckBox.isSelected()) {
            total += 0.5;
        }

        if (anchoCheckBox.isSelected()) {
            total += 0.5;
        }

        // set the text of totalText to the new value
        totalText.setText(String.valueOf(format.format(total)));
        totalText.setFont(font1);

    }

}
