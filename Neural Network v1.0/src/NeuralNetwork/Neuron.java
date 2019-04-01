package NeuralNetwork;

import java.util.ArrayList;
import java.util.Random;

public class Neuron {
    public ArrayList<Double> weights;
    public double input;
    public double output;

    public Neuron(double in,int size){
        weights = new ArrayList<>();
        this.input = in;
        Random random = new Random();
        for(int i = 0; i < size; ++i){
            this.weights.add(new Double((1 + (10 - 1)*random.nextDouble())/100));
        }
    }

    public Neuron(int size){
        weights = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < size; ++i){
            this.weights.add(new Double((1 + (10 - 1)*random.nextDouble())/100));
        }
    }

    public void setInput(double in){
        this.input = in;
    }

    public void activate(){
        this.output = Function.sigmoid(input);
    }


}
