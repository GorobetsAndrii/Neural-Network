package DataBase;

import NeuralNetwork.*;
import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;

import java.io.*;

public class NetworkToFile {
    File file;
    public NetworkToFile(String path){
        file = new File(path);
    }

    public void WriteNetworkToFile(Network network){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))){
            oos.writeObject(network);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Network ReadNetworkFromFile(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Network)ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
