package sample;
import NeuralNetwork.Network;
import DataBase.NetworkToFile;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class Model {
    NetworkToFile ntf = new NetworkToFile("Network.bin");
    Network net = ntf.ReadNetworkFromFile();

    public void PredictAndChart(ArrayList<Double> inputValue){
        ArrayList<Double> result = new ArrayList<>();
        result = net.Predict(inputValue);

        Stage stage = new Stage();
        stage.setTitle("Neural Network");
        final NumberAxis yAxis = new NumberAxis();
        final CategoryAxis xAxis = new CategoryAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("Predict value");
        xAxis.setLabel("Numbers");
        yAxis.setLabel("Value[%]");

        XYChart.Series series = new XYChart.Series();
        for(int i = 0; i < 10; ++i){
            series.getData().add(new XYChart.Data(String.valueOf(i),100*result.get(i)));
        }

        Scene scene = new Scene(bc,600,400);
        bc.getData().addAll(series);
        stage.setScene(scene);
        stage.show();
    }

}
