package DataBase;

import NeuralNetwork.*;

import java.io.*;

public class NetworkToFile {
    File file;
    public NetworkToFile(String path){
        file = new File(path);
    }

    public void WriteToFileNeuronWeights(Network network){
        FileWriter fw = null;
        try {
            fw = new FileWriter(file,false);
            //Input layer
            for(int i = 0; i < network.getInput_size(); ++i){
                for(int j = 0; j < network.Input_Layer.get(i).weights.size(); ++j){
                    fw.write(String.valueOf(network.Input_Layer.get(i).weights.get(j)) + " ");
                }
                fw.write(";");
            }
            fw.write("\r\n");
            //Hidden layer 1
            for(int i = 0; i < network.getHidden_1_size(); ++i){
                for(int j = 0; j < network.Hidden_Layer_1.get(i).weights.size(); ++j){
                    fw.write(String.valueOf(network.Hidden_Layer_1.get(i).weights.get(j)) + " ");
                }
                fw.write(";");
            }
            fw.write("\r\n");
            //Hidden layer 2
            for(int i = 0; i < network.getHidden_2_size(); ++i){
                for(int j = 0; j < network.Hidden_Layer_2.get(i).weights.size(); ++j){
                    fw.write(String.valueOf(network.Hidden_Layer_2.get(i).weights.get(j)) + " ");
                }
                fw.write(";");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean ReadNeuronWeights(){
        FileReader fr = null;
        try {
            fr = new FileReader(file);


            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return true;
    }
}
