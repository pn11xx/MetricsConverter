import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Optional;

public class Heights extends Application{

    public void start (Stage primaryStage){
        String height = JOptionPane.showInputDialog("Enter your height");

        TextInputDialog textInputDialog = new TextInputDialog("155.5");
        textInputDialog.setTitle("Height Metrics Converters");
        textInputDialog.setHeaderText("Centimeters tp feet and Inches Converters");
        textInputDialog.setContentText("Enter your height in Centimeter");
        Optional<String> result = textInputDialog.showAndWait();

        /*double heightInCm = 120.5;
        double heightInInches = heightInCm*0.39;
        int heightInFeet = (int) (heightInInches/12);
        int remainderHeightInInches = (int)heightInInches%12; */

        double heightInCm = Double.parseDouble(result.get());
        // ^ Set heightInCm equals to user's input (input) and convert it to double using parseDouble
        double heightInInches = heightInCm*0.39;//Convert from cm to inches
        int heightInFeet = (int)(heightInInches/12);//convert from inches to feet
        int remainderHeightInInches = (int)(heightInInches%12);//this is only gives you the remainder

        double heightInCmSwing = 120.5;
        double remainderHeightInInchesSwing = (int)heightInInches%12;
        int heightInFeetSwing = (int) (heightInInches/12);
        int remainderInInchesSwing = (int)heightInInches%12;

        JOptionPane.showMessageDialog(null, "Your height is " + heightInFeetSwing + " ft " + remainderInInchesSwing + " in");

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Height Converter");
        alert.setHeaderText("Your height is");
        alert.setContentText(heightInFeet + " ft" + remainderHeightInInches + " in");
        alert.showAndWait();
    }
}
