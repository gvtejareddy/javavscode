package hackerrank;

public class IncorrectFileNameException extends Exception{

    public IncorrectFileNameException() {
    }

    public IncorrectFileNameException(String message,Throwable err) {
        super(message,err);
    }

    public IncorrectFileNameException(String message) {
        super(message);
    }

}
