package Matrix;
import Exceptions.*;

public class Matrix{
    public double [] tab;
    public int rowSize;
    public int colSize;

    public Matrix(int r, int c){
        this.rowSize = r;
        this.colSize = c;
        tab = new double[r*c];
    }

    public Matrix(int r){
        this.rowSize = r;
        this.colSize = 1;
        tab = new double[r];
    }

    public int length(){
        return rowSize*colSize;
    }

    public void init(){
        for(int i = 0; i < this.length(); ++i){
            this.tab[i] = i+1;
        }
    }

    public Matrix sum(Matrix m) throws WrongMatrixSize {
        if(this.rowSize != m.rowSize || this.colSize != m.colSize) throw new WrongMatrixSize("Wrong matrix size");
        Matrix tmp = new Matrix(this.rowSize,this.colSize);
        for(int i = 0; i < this.length(); ++i){
            tmp.tab[i] = this.tab[i] + m.tab[i];
        }

        return tmp;
    }

    public Matrix sub(Matrix m) throws WrongMatrixSize{
        if(this.rowSize != m.rowSize || this.colSize != m.colSize) throw new WrongMatrixSize("Wrong matrix size");
        Matrix tmp = new Matrix(this.rowSize,this.colSize);
        for(int i = 0; i < this.length(); ++i){
            tmp.tab[i] = this.tab[i] - m.tab[i];
        }

        return tmp;
    }

    public Matrix dot(Matrix m) throws WrongMatrixSize{
        if(this.colSize != m.rowSize) throw new WrongMatrixSize("Wrong matrix size");
        Matrix tmp = new Matrix(this.rowSize,m.colSize);
        int counter = 0;
        for(int i = 0; i < this.rowSize; ++i){
            for(int j = 0; j < m.colSize; ++j){
                for(int k = 0; k < this.colSize; ++k){
                    tmp.tab[counter] += this.tab[this.colSize*i+k] * m.tab[m.colSize*k+j];
                }
                counter++;
            }
        }

        return tmp;
    }
}
