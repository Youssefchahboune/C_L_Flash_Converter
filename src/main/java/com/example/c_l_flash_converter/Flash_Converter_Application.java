package com.example.c_l_flash_converter;

import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

/*
    This is the main class where we will be building the GUI application

    Step1 : Create all Classes and implement them
    Step2 : Create the GUI
    Step3 : Merge classes And GUI
    Step4 : Style GUI
 */

public class Flash_Converter_Application extends Application {

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

        stage.show();
    }


}