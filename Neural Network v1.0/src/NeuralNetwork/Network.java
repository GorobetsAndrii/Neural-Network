package NeuralNetwork;

import javafx.util.Pair;

import java.util.ArrayList;

public class Network {
    ArrayList<Neuron> Input_Layer;
    ArrayList<Neuron> Hidden_Layer_1;
    ArrayList<Neuron> Hidden_Layer_2;
    ArrayList<Double> Output_Layer;
    private int Input_size = 15;
    private int Hidden_1_size = 70;
    private int Hidden_2_size = 30;
    private int Out_size = 10;

    public Network(){
        Input_Layer = new ArrayList<>();
        Hidden_Layer_1 = new ArrayList<>();
        Hidden_Layer_2 = new ArrayList<>();
        Output_Layer = new ArrayList<>();

//        for (int i = 0; i < Input_size; ++i){
//            Input_Layer.add(new Neuron(Hidden_1_size));
//        }
        for (int i = 0; i < Hidden_1_size; ++i){
            Hidden_Layer_1.add(new Neuron(Hidden_2_size));
        }
        for (int i = 0; i < Hidden_2_size; ++i){
            Hidden_Layer_2.add(new Neuron(Out_size));
        }
        for (int i = 0; i < Out_size; ++i){
            Output_Layer.add(0.0);
        }
    }

    public ArrayList<Double> Predict(ArrayList<Double> input_values){
        for (int i = 0; i < input_values.size(); ++i){
            Input_Layer.add(new Neuron(input_values.get(i),Hidden_1_size));
        }

        for(int i = 0; i < Hidden_1_size; ++i){
            double temporary_sum = 0;
            for(int j = 0; j < Input_size; ++j){
                temporary_sum += Input_Layer.get(j).input*Input_Layer.get(j).weights.get(i);
            }
            Hidden_Layer_1.get(i).input = temporary_sum;
            Hidden_Layer_1.get(i).output = Function.sigmoid(temporary_sum);
        }

        for(int i = 0; i < Hidden_2_size; ++i){
            double temporary_sum = 0;
            for(int j = 0; j < Hidden_1_size; ++j){
                temporary_sum += Hidden_Layer_1.get(j).output*Hidden_Layer_1.get(j).weights.get(i);
            }
            Hidden_Layer_2.get(i).input = temporary_sum;
            Hidden_Layer_2.get(i).output = Function.sigmoid(temporary_sum);
        }

        for(int i = 0; i < Out_size; ++i){
            double temporary_sum = 0;
            for(int j = 0; j < Hidden_2_size; ++j){
                temporary_sum += Hidden_Layer_2.get(j).output*Hidden_Layer_2.get(j).weights.get(i);
            }
            Output_Layer.set(i,Function.sigmoid(temporary_sum));
        }

        return Output_Layer;
    }

    public void Training(ArrayList<Pair<ArrayList<Double>,Integer>> Train,int Epochs,double Learning_rate){
        ArrayList<Double> predict = new ArrayList<>();
        for(int i = 0; i < Epochs; ++i){
            for(int j = 0; j < Train.size(); ++j){
                predict = this.Predict(Train.get(j).getKey());
                for(int k = 0; k < predict.size(); ++k){
                    ArrayList<Double> out_error = new ArrayList<>();

                    //Save errors for this predict
                    for(int l = 0; l < Out_size; ++l){
                        if(l == Train.get(j).getValue()-1){
                            out_error.add(predict.get(l) - 1);
                        }else{
                            out_error.add(predict.get(l) - 0);
                        }
                    }

                }
            }
        }
    }

    public void print(){
        for(Neuron n : Input_Layer){
            System.out.println(n.input);
        }
        System.out.println(this.Hidden_Layer_2.size());
    }
}
