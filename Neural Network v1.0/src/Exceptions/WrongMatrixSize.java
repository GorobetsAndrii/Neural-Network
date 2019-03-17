package Exceptions;

public class WrongMatrixSize extends Exception{
    public WrongMatrixSize() {
        super();
    }

    public WrongMatrixSize(String message) {
        super(message);
    }

    public WrongMatrixSize(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongMatrixSize(Throwable cause) {
        super(cause);
    }

    protected WrongMatrixSize(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
