package NeuralNetwork;

import javafx.util.Pair;

import java.util.ArrayList;

public class Network {
    ArrayList<Neuron> Input_Layer;
    ArrayList<Neuron> Hidden_Layer_1;
    ArrayList<Neuron> Hidden_Layer_2;
    ArrayList<Double> Output_Layer;
    private int Input_size = 15;
    private int Hidden_1_size = 40;
    private int Hidden_2_size = 20;
    private int Out_size = 10;

    public Network(){
        Input_Layer = new ArrayList<>();
        Hidden_Layer_1 = new ArrayList<>();
        Hidden_Layer_2 = new ArrayList<>();
        Output_Layer = new ArrayList<>();

        for (int i = 0; i < Input_size; ++i){
            Input_Layer.add(new Neuron(Hidden_1_size));
        }
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
        for (int i = 0; i < Input_size; ++i){
            Input_Layer.get(i).setInput(input_values.get(i));
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
        for(int i = 0; i<1;++i){
            for(int j=0;j<Hidden_Layer_2.get(i).weights.size();++j){
                System.out.println(Hidden_Layer_2.get(i).weights.get(j));
            }
        }
        ArrayList<Double> predict = new ArrayList<>();
        //Epochs
        for(int i = 0; i < Epochs; ++i){
            //Train set
            for(int j = 0; j < Train.size(); ++j){
                predict = this.Predict(Train.get(j).getKey());
                ArrayList<Double> out_error = new ArrayList<>();
                ArrayList<Double> weights_delta = new ArrayList<>();
                //Save errors and weights_delta for this predict
                for(int l = 0; l < Out_size; ++l){
                    if(l == Train.get(j).getValue()-1){
                        out_error.add(predict.get(l));
                    }else{
                        out_error.add(predict.get(l) - 0);
                    }
                    weights_delta.add(out_error.get(l)*Function.sigmoid_dx(predict.get(l)));
                }

                //--------------------------------------------------------------------------------------------------
                ArrayList<Double> Hidden_2_error = new ArrayList<>();
                ArrayList<Double> Hidden_2_weights_delta = new ArrayList<>();
                ArrayList<Double> Hidden_1_error = new ArrayList<>();
                ArrayList<Double> Hidden_1_weights_delta = new ArrayList<>();
                ArrayList<Double> Input_error = new ArrayList<>();
                ArrayList<Double> Input_weights_delta = new ArrayList<>();

                for(int p = 0; p < predict.size(); ++p){
                    for(int h2= 0; h2 < Hidden_2_size; ++h2){
                        Hidden_Layer_2.get(h2).weights.set(p,Hidden_Layer_2.get(h2).weights.get(p)-Hidden_Layer_2.get(h2).output*weights_delta.get(p)*Learning_rate);
                        Hidden_2_error.add(Hidden_Layer_2.get(h2).weights.get(p)*weights_delta.get(p));
                        Hidden_2_weights_delta.add(Hidden_2_error.get(h2)*Function.sigmoid_dx(Hidden_Layer_2.get(h2).output));
                        for(int h1= 0; h1 < Hidden_1_size; ++h1){
                            Hidden_Layer_1.get(h1).weights.set(h2,Hidden_Layer_1.get(h1).weights.get(h2)-Hidden_Layer_1.get(h1).output*Hidden_2_weights_delta.get(h2)*Learning_rate);
                            Hidden_1_error.add(Hidden_Layer_1.get(h1).weights.get(h2)*Hidden_2_weights_delta.get(h2));
                            Hidden_1_weights_delta.add(Hidden_1_error.get(h1)*Function.sigmoid_dx(Hidden_Layer_1.get(h1).output));
                            for(int in = 0; in < Input_size; ++in){
                                Input_Layer.get(in).weights.set(h1,Input_Layer.get(in).weights.get(h1)-Input_Layer.get(in).output*Hidden_1_weights_delta.get(h1)*Learning_rate);
                                Input_error.add(Input_Layer.get(in).weights.get(h1)*Hidden_1_weights_delta.get(h1));
                                Input_weights_delta.add(Input_error.get(in)*Function.sigmoid_dx(Input_Layer.get(in).output));
                            }
                            Input_error.clear();
                            Input_weights_delta.clear();
                        }
                        Hidden_1_error.clear();
                        Hidden_1_weights_delta.clear();
                    }
                    Hidden_2_error.clear();
                    Hidden_2_weights_delta.clear();
                }
                out_error.clear();
                weights_delta.clear();
            }
        }
        System.out.println("\n\n\n");
        System.out.println("Fixed");
        for(int i = 0; i<1;++i){
            for(int j=0;j<Hidden_Layer_2.get(i).weights.size();++j){
                System.out.println(Hidden_Layer_2.get(i).weights.get(j));
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
