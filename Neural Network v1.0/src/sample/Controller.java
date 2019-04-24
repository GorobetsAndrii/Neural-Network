package sample;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller {
    Model model = new Model();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private VBox vbox;

    @FXML
    private AnchorPane mainpane;

    @FXML
    private Pane window;

    @FXML
    private Rectangle pixel1;

    @FXML
    private Rectangle pixel2;

    @FXML
    private Rectangle pixel3;

    @FXML
    private Rectangle pixel4;

    @FXML
    private Rectangle pixel5;

    @FXML
    private Rectangle pixel6;

    @FXML
    private Rectangle pixel7;

    @FXML
    private Rectangle pixel8;

    @FXML
    private Rectangle pixel9;

    @FXML
    private Rectangle pixel10;

    @FXML
    private Rectangle pixel11;

    @FXML
    private Rectangle pixel12;

    @FXML
    private Rectangle pixel15;

    @FXML
    private Rectangle pixel14;

    @FXML
    private Rectangle pixel13;

    @FXML
    private Button reset;

    @FXML
    private Button predict;

    @FXML
    private AnchorPane panetitle;

    @FXML
    private Label title;

    @FXML
    private ArrayList<Rectangle> rectangles = new ArrayList<>();

    @FXML
    void initialize() {
        rectangles.add(pixel1);
        rectangles.add(pixel2);
        rectangles.add(pixel3);
        rectangles.add(pixel4);
        rectangles.add(pixel5);
        rectangles.add(pixel6);
        rectangles.add(pixel7);
        rectangles.add(pixel8);
        rectangles.add(pixel9);
        rectangles.add(pixel10);
        rectangles.add(pixel11);
        rectangles.add(pixel12);
        rectangles.add(pixel13);
        rectangles.add(pixel14);
        rectangles.add(pixel15);


        for(Rectangle pixel : rectangles){
            pixel.setOnMouseClicked(event -> {
                if(pixel.getFill().equals(Color.web("#1e90ff"))) pixel.setFill(Color.web("#012763"));
                else pixel.setFill(Color.web("#1e90ff"));
            });
        }

        reset.setOnAction(event -> {
            for(Rectangle pixel : rectangles){
                pixel.setFill(Color.web("#1e90ff"));
            }
        });

        predict.setOnAction(event -> {
            ArrayList<Double> temporary = new ArrayList<>();
            for(Rectangle r: rectangles){
                if(r.getFill().equals(Color.web("#012763"))) temporary.add(1.0);
                else temporary.add(0.0);
            }
            model.PredictAndChart(temporary);
        });
    }
}

