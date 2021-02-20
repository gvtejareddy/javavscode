package interviewpack.Exceptions;

public class CustomMyException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 3117189553774926544L;

    public CustomMyException(String message) {
        super(message);

        System.out.println(message);
    }

    public CustomMyException() {
    }

    public CustomMyException(Throwable cause) {
        super(cause);
    }

    public CustomMyException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomMyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
