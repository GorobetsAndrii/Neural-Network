package sample;
import Exceptions.WrongMatrixSize;
import Matrix.*;
import NeuralNetwork.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        ArrayList<Double> result = new ArrayList<>();
        ArrayList<Pair<ArrayList<Double>,Integer>> lst = new ArrayList<>();
        list.add(1.0);
        list.add(0.0);
        list.add(1.0);
        list.add(0.0);
        list.add(1.0);
        list.add(0.0);
        list.add(1.0);
        list.add(0.0);
        list.add(1.0);
        list.add(0.0);
        list.add(0.0);
        list.add(0.0);
        list.add(0.0);
        list.add(1.0);
        list.add(0.0);

        lst.add(new Pair<>(list,3));
        Network net = new Network();
        //result = net.Predict(list);
        //net.Training(lst,1,1);

//        for(Double d : result){
//            System.out.println(d);
//        }
        launch(args);
    }
}
