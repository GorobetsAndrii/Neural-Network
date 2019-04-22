package sample;
import Exceptions.WrongMatrixSize;
import Matrix.*;
import NeuralNetwork.*;
import DataBase.*;
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
        Parent root = FXMLLoader.load(getClass().getResource("Scene1full.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 640, 418));
        primaryStage.show();
    }


    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        ArrayList<Double> list3 = new ArrayList<>();
        ArrayList<Double> list4 = new ArrayList<>();
        ArrayList<Double> list5 = new ArrayList<>();
        ArrayList<Double> list6 = new ArrayList<>();
        ArrayList<Double> list7 = new ArrayList<>();
        ArrayList<Double> list8 = new ArrayList<>();
        ArrayList<Double> list9 = new ArrayList<>();
        ArrayList<Double> result = new ArrayList<>();
        ArrayList<Pair<ArrayList<Double>,Integer>> lst = new ArrayList<>();

        //0
        list.add(1.0);list.add(1.0);list.add(1.0);
        list.add(1.0);list.add(0.0);list.add(1.0);
        list.add(1.0);list.add(0.0);list.add(1.0);
        list.add(1.0);list.add(0.0);list.add(1.0);
        list.add(1.0);list.add(1.0);list.add(1.0);
        lst.add(new Pair<>(list,0));

        //1
        list1.add(0.0);list1.add(0.0);list1.add(1.0);
        list1.add(0.0);list1.add(0.0);list1.add(1.0);
        list1.add(0.0);list1.add(0.0);list1.add(1.0);
        list1.add(0.0);list1.add(0.0);list1.add(1.0);
        list1.add(0.0);list1.add(0.0);list1.add(1.0);
        lst.add(new Pair<>(list1,1));

       //2
        list2.add(1.0);list2.add(1.0);list2.add(1.0);
        list2.add(0.0);list2.add(0.0);list2.add(1.0);
        list2.add(1.0);list2.add(1.0);list2.add(1.0);
        list2.add(1.0);list2.add(0.0);list2.add(0.0);
        list2.add(1.0);list2.add(1.0);list2.add(1.0);
        lst.add(new Pair<>(list2,2));

        //3
        list3.add(1.0);list3.add(1.0);list3.add(1.0);
        list3.add(0.0);list3.add(0.0);list3.add(1.0);
        list3.add(1.0);list3.add(1.0);list3.add(1.0);
        list3.add(0.0);list3.add(0.0);list3.add(1.0);
        list3.add(1.0);list3.add(1.0);list3.add(1.0);
        lst.add(new Pair<>(list3,3));

        //4
        list4.add(1.0);list4.add(0.0);list4.add(1.0);
        list4.add(1.0);list4.add(0.0);list4.add(1.0);
        list4.add(1.0);list4.add(1.0);list4.add(1.0);
        list4.add(0.0);list4.add(0.0);list4.add(1.0);
        list4.add(0.0);list4.add(0.0);list4.add(1.0);
        lst.add(new Pair<>(list4,4));

        //5
        list5.add(1.0);list5.add(1.0);list5.add(1.0);
        list5.add(1.0);list5.add(0.0);list5.add(0.0);
        list5.add(1.0);list5.add(1.0);list5.add(1.0);
        list5.add(0.0);list5.add(0.0);list5.add(1.0);
        list5.add(1.0);list5.add(1.0);list5.add(1.0);
        lst.add(new Pair<>(list5,5));

        //6
        list6.add(1.0);list6.add(1.0);list6.add(1.0);
        list6.add(1.0);list6.add(0.0);list6.add(0.0);
        list6.add(1.0);list6.add(1.0);list6.add(1.0);
        list6.add(1.0);list6.add(0.0);list6.add(1.0);
        list6.add(1.0);list6.add(1.0);list6.add(1.0);
        lst.add(new Pair<>(list6,6));

        //7
        list7.add(7.0);list7.add(7.0);list7.add(7.0);
        list7.add(0.0);list7.add(0.0);list7.add(7.0);
        list7.add(0.0);list7.add(0.0);list7.add(7.0);
        list7.add(0.0);list7.add(0.0);list7.add(7.0);
        list7.add(0.0);list7.add(0.0);list7.add(7.0);
        lst.add(new Pair<>(list7,7));

        //8
        list8.add(1.0);list8.add(1.0);list8.add(1.0);
        list8.add(1.0);list8.add(0.0);list8.add(1.0);
        list8.add(1.0);list8.add(1.0);list8.add(1.0);
        list8.add(1.0);list8.add(0.0);list8.add(1.0);
        list8.add(1.0);list8.add(1.0);list8.add(1.0);
        lst.add(new Pair<>(list8,8));

        //9
        list9.add(1.0);list9.add(1.0);list9.add(1.0);
        list9.add(1.0);list9.add(0.0);list9.add(1.0);
        list9.add(1.0);list9.add(1.0);list9.add(1.0);
        list9.add(0.0);list9.add(0.0);list9.add(1.0);
        list9.add(1.0);list9.add(1.0);list9.add(1.0);
        lst.add(new Pair<>(list9,9));

        lst.add(new Pair<>(list9,9));
        lst.add(new Pair<>(list1,1));
        lst.add(new Pair<>(list,0));
        lst.add(new Pair<>(list5,5));
        lst.add(new Pair<>(list7,7));
        lst.add(new Pair<>(list4,4));
        lst.add(new Pair<>(list3,3));
        lst.add(new Pair<>(list6,6));
        lst.add(new Pair<>(list2,2));
        lst.add(new Pair<>(list8,8));

        lst.add(new Pair<>(list7,7));
        lst.add(new Pair<>(list3,3));
        lst.add(new Pair<>(list2,2));
        lst.add(new Pair<>(list6,6));
        lst.add(new Pair<>(list8,8));
        lst.add(new Pair<>(list1,1));
        lst.add(new Pair<>(list4,4));
        lst.add(new Pair<>(list,0));
        lst.add(new Pair<>(list5,5));
        lst.add(new Pair<>(list9,9));

        lst.add(new Pair<>(list8,8));

        lst.add(new Pair<>(list1,1));
        lst.add(new Pair<>(list,0));
        lst.add(new Pair<>(list5,5));
        lst.add(new Pair<>(list8,8));
        lst.add(new Pair<>(list4,4));
        lst.add(new Pair<>(list3,3));
        lst.add(new Pair<>(list9,9));
        lst.add(new Pair<>(list6,6));
        lst.add(new Pair<>(list2,2));
        lst.add(new Pair<>(list7,7));
        lst.add(new Pair<>(list9,9));
        lst.add(new Pair<>(list8,8));



        Network net = new Network();
        //net.Training(lst,17000,0.07);

        result = net.Predict(list);
        System.out.println("\n\n\n");
        System.out.println("result for 0");
        for(Double d : result){
            System.out.println(d);
        }

        result = net.Predict(list1);
        System.out.println("\n\n\n");
        System.out.println("result for 1");
        for(Double d : result){
            System.out.println(d);
        }

        result = net.Predict(list2);
        System.out.println("\n\n\n");
        System.out.println("result for 2");
        for(Double d : result){
            System.out.println(d);
        }

        result = net.Predict(list3);
        System.out.println("\n\n\n");
        System.out.println("result for 3");
        for(Double d : result){
            System.out.println(d);
        }

        result = net.Predict(list4);
        System.out.println("\n\n\n");
        System.out.println("result for 4");
        for(Double d : result){
            System.out.println(d);
        }

        result = net.Predict(list5);
        System.out.println("\n\n\n");
        System.out.println("result for 5");
        for(Double d : result){
            System.out.println(d);
        }

        result = net.Predict(list6);
        System.out.println("\n\n\n");
        System.out.println("result for 6");
        for(Double d : result){
            System.out.println(d);
        }

        result = net.Predict(list7);
        System.out.println("\n\n\n");
        System.out.println("result for 7");
        for(Double d : result){
            System.out.println(d);
        }

        result = net.Predict(list8);
        System.out.println("\n\n\n");
        System.out.println("result for 8");
        for(Double d : result){
            System.out.println(d);
        }

        result = net.Predict(list9);
        System.out.println("\n\n\n");
        System.out.println("result for 9");
        for(Double d : result){
            System.out.println(d);
        }

        NetworkToFile n = new NetworkToFile("Network.bin");
        n.WriteNetworkToFile(net);

        launch(args);
    }
}
