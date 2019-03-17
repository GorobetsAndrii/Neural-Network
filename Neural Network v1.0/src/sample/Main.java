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

        //0
        list.add(1.0);list.add(1.0);list.add(1.0);
        list.add(1.0);list.add(0.0);list.add(1.0);
        list.add(1.0);list.add(0.0);list.add(1.0);
        list.add(1.0);list.add(0.0);list.add(1.0);
        list.add(1.0);list.add(1.0);list.add(1.0);
        lst.add(new Pair<>(list,0));
        //list.clear();
//        //1
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        lst.add(new Pair<>(list,1));
//        list.clear();
//        //2
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(1.0);list.add(0.0);list.add(0.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        lst.add(new Pair<>(list,2));
//        list.clear();
//        //3
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        lst.add(new Pair<>(list,3));
//        list.clear();
//        //4
//        list.add(1.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        lst.add(new Pair<>(list,4));
//        list.clear();
//        //5
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(1.0);list.add(0.0);list.add(0.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        lst.add(new Pair<>(list,5));
//        list.clear();
//        //6
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(1.0);list.add(0.0);list.add(0.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(1.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        lst.add(new Pair<>(list,6));
//        list.clear();
//        //7
//        list.add(7.0);list.add(7.0);list.add(7.0);
//        list.add(0.0);list.add(0.0);list.add(7.0);
//        list.add(0.0);list.add(0.0);list.add(7.0);
//        list.add(0.0);list.add(0.0);list.add(7.0);
//        list.add(0.0);list.add(0.0);list.add(7.0);
//        lst.add(new Pair<>(list,7));
//        list.clear();
//        //8
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(1.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(1.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        lst.add(new Pair<>(list,8));
//        list.clear();
//        //9
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(1.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        list.add(0.0);list.add(0.0);list.add(1.0);
//        list.add(1.0);list.add(1.0);list.add(1.0);
//        lst.add(new Pair<>(list,9));
//        list.clear();

        Network net = new Network();
        net.Training(lst,1000,0.05);

        //6
        list.add(1.0);list.add(1.0);list.add(1.0);
        list.add(1.0);list.add(0.0);list.add(0.0);
        list.add(1.0);list.add(1.0);list.add(1.0);
        list.add(1.0);list.add(0.0);list.add(1.0);
        list.add(1.0);list.add(1.0);list.add(1.0);

        result = net.Predict(list);
        System.out.println("\n\n\n");
        System.out.println("result");
        for(Double d : result){
            System.out.println(d);
        }


        launch(args);
    }
}
