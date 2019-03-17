package NeuralNetwork;

import java.lang.Math;

public class Function {
    public static double sigmoid(double x){
        return 1/(1+Math.exp(-x));
    }
    public static double sigmoid_dx(double x) { return sigmoid(x)*(1-sigmoid(x));}
}
