package sample;
import NeuralNetwork.Network;
import DataBase.NetworkToFile;
public class Model {
    NetworkToFile ntf = new NetworkToFile("Network.bin");
    Network net = ntf.ReadNetworkFromFile();

}
