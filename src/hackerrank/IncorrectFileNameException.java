package hackerrank;

public class IncorrectFileNameException extends Exception{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public IncorrectFileNameException() {
    }

    public IncorrectFileNameException(String message,Throwable err) {
        super(message,err);
    }

    public IncorrectFileNameException(String message) {
        super(message);
    }

}
