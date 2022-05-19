package com.example.c_l_flash_converter;

import CurrencyConverterPakage.CurrencyConverter;
import LengthConverterPakage.LengthConverter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

/*
    This class is called Flash_Converter_Application and this class will serve as
    our main class where we will be building the GUI application.
 */

public class Flash_Converter_Application extends Application {

    //  currency converter fields
    private TextField currencyTopTextField;
    private TextField currencyBottomTextField;
    private ComboBox<String> currencyBottomComboBox;
    private ComboBox<String> currencyTopComboBox;

    //  Length converter fields
    private TextField lengthTopTextField;
    private TextField lengthBottomTextField;
    private ComboBox<String> lengthBottomComboBox;
    private ComboBox<String> lengthTopComboBox;

    public static void main(String[] args) {
    launch();
}

    @Override
    public void start(Stage stage) throws IOException {

        //setting window title
        stage.setTitle("C&L Flash Converter");

        //setting window size
        stage.setMinWidth(1200);
        stage.setMinHeight(800);
        stage.setMaxWidth(1200);
        stage.setMaxHeight(800);


        //**************************************************************************************/
        //***************************** Currency Converter *************************************/
        //**************************************************************************************/

        // title of currency converter
        Label currencyTitle = new Label("Currency");
        currencyTitle.setId("currency-title");

        // top text field and Combo box
        currencyTopTextField = new TextField();
        currencyTopTextField.setId("currency-Top-TextField");
        currencyTopTextField.setMaxWidth(150);

        currencyTopComboBox = new ComboBox<>();
        currencyTopComboBox.getItems().addAll("CAD","USD","YEN","EURO");
        currencyTopComboBox.setId("currency-Top-ComboBox");

        // top input container that will have text field and combo box
        HBox topInputCurrencyContainer = new HBox(10);
        topInputCurrencyContainer.getChildren().addAll(currencyTopTextField, currencyTopComboBox);
        topInputCurrencyContainer.setAlignment(Pos.CENTER);


        // bottom text field and Combo box
        currencyBottomTextField = new TextField();
        currencyBottomTextField.setMaxWidth(150);
        currencyBottomTextField.setEditable(false);
        currencyBottomTextField.setId("currency-bottom-TextField");

        currencyBottomComboBox = new ComboBox<>();
        currencyBottomComboBox.getItems().addAll("CAD","USD","YEN","EURO");
        currencyBottomComboBox.setId("currency-Bottom-ComboBox");

        // bottom output container that will have text field and combo box
        HBox bottomOutputCurrencyContainer = new HBox(10);
        bottomOutputCurrencyContainer.getChildren().addAll(currencyBottomTextField,currencyBottomComboBox);
        bottomOutputCurrencyContainer.setAlignment(Pos.CENTER);

        // Currency buttons (Convert , Switch, Clear)
        Button convertCurrencyBtn = new Button("Convert");
        convertCurrencyBtn.getStyleClass().add("blue-button");
        convertCurrencyBtn.setMinWidth(100);
        convertCurrencyBtn.setMinHeight(35);
        // convert input
        convertCurrencyBtn.setOnAction(new convertCurrencyButton());

        Button switchCurrencyBtn = new Button("Switch");
        switchCurrencyBtn.getStyleClass().add("blue-button");
        switchCurrencyBtn.setMinWidth(100);
        switchCurrencyBtn.setMinHeight(35);
        // switch currency1 and currency2
        switchCurrencyBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String topValue = currencyTopComboBox.getValue();
                String bottomValue= currencyBottomComboBox.getValue();

                currencyTopComboBox.setValue(bottomValue);
                currencyBottomComboBox.setValue(topValue);
            }
        });

        Button clearCurrencyBtn = new Button("C");
        clearCurrencyBtn.getStyleClass().add("gray-button");
        clearCurrencyBtn.setMinWidth(35);
        clearCurrencyBtn.setMinHeight(34);
        // clear everything on the currency converter
        clearCurrencyBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                currencyTopTextField.clear();
                currencyBottomTextField.clear();
                currencyTopComboBox.setValue(null);
                currencyBottomComboBox.setValue(null);
            }
        });

        // bottom container that will have three buttons (convert, switch , and clear)
        HBox currencyButtonsContainer = new HBox(10);
        currencyButtonsContainer.getChildren().addAll(convertCurrencyBtn,switchCurrencyBtn,clearCurrencyBtn);
        currencyButtonsContainer.setAlignment(Pos.CENTER);


        // Top and bottom part of the currency converter
        VBox topCurrencyConverter = new VBox(75);
        topCurrencyConverter.getChildren().addAll(currencyTitle,topInputCurrencyContainer);
        topCurrencyConverter.setAlignment(Pos.CENTER);
        topCurrencyConverter.setMinWidth(350);
        topCurrencyConverter.setMinHeight(250);
        topCurrencyConverter.setId("top-currency-converter");

        VBox bottomCurrencyConverter = new VBox(75);
        bottomCurrencyConverter.getChildren().addAll(bottomOutputCurrencyContainer,currencyButtonsContainer);
        bottomCurrencyConverter.setAlignment(Pos.CENTER);
        bottomCurrencyConverter.setMinWidth(350);
        bottomCurrencyConverter.setMinHeight(250);
        bottomCurrencyConverter.setId("bottom-currency-converter");


        // Container for the currency converter
        VBox currencyConverterContainer = new VBox();
        currencyConverterContainer.getChildren().addAll(topCurrencyConverter,bottomCurrencyConverter);
        currencyConverterContainer.setAlignment(Pos.CENTER);


        //******************************************************************************************/
        //********************************** Length Converter *************************************/
        //*****************************************************************************************/

        // title of length converter
        Label lengthTitle = new Label("Length");
        lengthTitle.setId("length-title");

        // top text field and Combo box for length converter
        lengthTopTextField = new TextField();
        lengthTopTextField.setId("length-Top-TextField");
        lengthTopTextField.setMaxWidth(150);

        lengthTopComboBox = new ComboBox<>();
        lengthTopComboBox.getItems().addAll("KM","M","CM","MM");
        lengthTopComboBox.setId("length-Top-ComboBox");

        // top input container that will have text field and combo box
        HBox topInputLengthContainer = new HBox(10);
        topInputLengthContainer.getChildren().addAll(lengthTopTextField, lengthTopComboBox);
        topInputLengthContainer.setAlignment(Pos.CENTER);


        // bottom text field and Combo box for length converter
        lengthBottomTextField = new TextField();
        lengthBottomTextField.setMaxWidth(150);
        lengthBottomTextField.setEditable(false);
        lengthBottomTextField.setId("length-bottom-TextField");

        lengthBottomComboBox = new ComboBox<>();
        lengthBottomComboBox.getItems().addAll("KM","M","CM","MM");
        lengthBottomComboBox.setId("length-Bottom-ComboBox");

        // bottom output container that will have text field and combo box
        HBox bottomOutputLengthContainer = new HBox(10);
        bottomOutputLengthContainer.getChildren().addAll(lengthBottomTextField,lengthBottomComboBox);
        bottomOutputLengthContainer.setAlignment(Pos.CENTER);

        // Length buttons (Convert , Switch, Clear)
        Button convertLengthBtn = new Button("Convert");
        convertLengthBtn.getStyleClass().add("black-button");
        convertLengthBtn.setMinWidth(100);
        convertLengthBtn.setMinHeight(35);
        // convert measurement entered
        convertLengthBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // if the comboboxes and the input is empty show error dialog
                if (lengthTopTextField.getText().isEmpty() || lengthTopComboBox.getSelectionModel().isEmpty() || lengthBottomComboBox.getSelectionModel().isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error Dialog");
                    alert.setHeaderText("Error Occurred");
                    alert.setContentText("One of the fields is empty, make sure that you selected the units and that you entered a measurement to be converted !");
                    alert.showAndWait();
                }
                // if the input is not a number show error dialog
                else if (!(lengthTopTextField.getText().matches("^\\d*(\\.\\d+)?$"))){
                    lengthTopTextField.clear();
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error Dialog");
                    alert.setHeaderText("Error Occurred");
                    alert.setContentText("The input that you entered is not a measurement, please enter a measurement !");
                    alert.showAndWait();
                }
                // if the input is a negative number show error dialog
                else if (Double.parseDouble(lengthTopTextField.getText()) < 0){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Error Dialog");
                    alert.setHeaderText("Error Occurred");
                    alert.setContentText("The measurement you entered is lower than zero, please enter a measurement equal or above zero !");
                    alert.showAndWait();
                }
                // else convert the input to new unit desired and show result to bottom text field
                else {
                    double input = Double.parseDouble(lengthTopTextField.getText());
                    String unit1 = lengthTopComboBox.getValue();
                    String unit2 = lengthBottomComboBox.getValue();
                    LengthConverter converter = new LengthConverter(input);
                    converter.setUnit1(unit1);
                    converter.setUnit2(unit2);

                    double result = converter.converting();

                    lengthBottomTextField.setText(Double.toString(result));
                }
            }
        });

        Button switchLengthBtn = new Button("Switch");
        switchLengthBtn.getStyleClass().add("black-button");
        switchLengthBtn.setMinWidth(100);
        switchLengthBtn.setMinHeight(35);
        // switch unit1 and unit2
        switchLengthBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String topValue = lengthTopComboBox.getValue();
                String bottomValue= lengthBottomComboBox.getValue();

                lengthTopComboBox.setValue(bottomValue);
                lengthBottomComboBox.setValue(topValue);
            }
        });

        Button clearLengthBtn = new Button("C");
        clearLengthBtn.getStyleClass().add("gray-button");
        clearLengthBtn.setMinWidth(35);
        clearLengthBtn.setMinHeight(34);
        // clear everything on the length converter
        clearLengthBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                lengthTopTextField.clear();
                lengthBottomTextField.clear();
                lengthTopComboBox.setValue(null);
                lengthBottomComboBox.setValue(null);
            }
        });

        // bottom container that will have three buttons (convert, switch , and clear)
        HBox lengthButtonsContainer = new HBox(10);
        lengthButtonsContainer.getChildren().addAll(convertLengthBtn,switchLengthBtn,clearLengthBtn);
        lengthButtonsContainer.setAlignment(Pos.CENTER);


        // Top and bottom part of the length converter
        VBox topLengthConverter = new VBox(75);
        topLengthConverter.getChildren().addAll(lengthTitle,topInputLengthContainer);
        topLengthConverter.setAlignment(Pos.CENTER);
        topLengthConverter.setMinWidth(350);
        topLengthConverter.setMinHeight(250);
        topLengthConverter.setId("top-length-converter");

        VBox bottomLengthConverter = new VBox(75);
        bottomLengthConverter.getChildren().addAll(bottomOutputLengthContainer,lengthButtonsContainer);
        bottomLengthConverter.setAlignment(Pos.CENTER);
        bottomLengthConverter.setMinWidth(350);
        bottomLengthConverter.setMinHeight(250);
        bottomLengthConverter.setId("bottom-length-converter");


        // Container for the length converter
        VBox lengthConverterContainer = new VBox();
        lengthConverterContainer.getChildren().addAll(topLengthConverter,bottomLengthConverter);
        lengthConverterContainer.setAlignment(Pos.CENTER);


        //-------------------------------------------------------------------------------------------/

        // Main title of application
        Label title = new Label("Flash Converter");
        title.setId("app-title");

        // Hbox that will contain the two converter (Currency and Length)
        HBox containerForConverters = new HBox(100);
        containerForConverters.getChildren().addAll(currencyConverterContainer,lengthConverterContainer);
        containerForConverters.setAlignment(Pos.CENTER);

        // container that contains the title and the Hbox for the two converters
        VBox container = new VBox(50);
        container.setAlignment(Pos.CENTER);
        container.getChildren().addAll(title,containerForConverters);

        // scene
        Scene scene = new Scene(container);
        String css = getClass().getResource("/css/Flash Converter Style sheet.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);

        stage.show();
    }


    class convertCurrencyButton implements EventHandler<ActionEvent> {

        // method that convert the amount entered
        @Override
        public void handle(ActionEvent event) {

            // if the comboboxes and the input is empty show error dialog
            if (currencyTopTextField.getText().isEmpty() || currencyTopComboBox.getSelectionModel().isEmpty() || currencyBottomComboBox.getSelectionModel().isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("Error Occurred");
                alert.setContentText("One of the fields is empty, make sure that you selected the currency and that you entered an amount to be converted !");
                alert.showAndWait();
            }
            // if the input is not a number show error dialog
            else if (!(currencyTopTextField.getText().matches("^\\d*(\\.\\d+)?$"))){
                currencyTopTextField.clear();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("Error Occurred");
                alert.setContentText("The input that you entered is not a number, please enter a number !");
                alert.showAndWait();
            }
            // if the input is a negative number show error dialog
            else if (Double.parseDouble(currencyTopTextField.getText()) < 0){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error Dialog");
                alert.setHeaderText("Error Occurred");
                alert.setContentText("The amount you entered is lower than zero, please enter a number equal or above zero !");
                alert.showAndWait();
            }
            // else convert the input to new currency desired and show result to bottom text field
            else {
                double input = Double.parseDouble(currencyTopTextField.getText());
                String country1 = currencyTopComboBox.getValue();
                String country2 = currencyBottomComboBox.getValue();
                CurrencyConverter converter = new CurrencyConverter(input);
                converter.setCurrency1(country1);
                converter.setCurrency2(country2);

                double result = converter.converting();

                currencyBottomTextField.setText(Double.toString(result));
            }

        }
    }


}