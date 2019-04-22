package sample;
import NeuralNetwork.Network;
import DataBase.NetworkToFile;

import java.util.ArrayList;

public class Model {
    NetworkToFile ntf = new NetworkToFile("Network.bin");
    Network net = ntf.ReadNetworkFromFile();

    public void PredictAndChart(ArrayList<Double> inputValue){
        ArrayList<Double> result = new ArrayList<>();
        result = net.Predict(inputValue);

        for(Double d : result){
            System.out.println(d);
        }
    }

}
