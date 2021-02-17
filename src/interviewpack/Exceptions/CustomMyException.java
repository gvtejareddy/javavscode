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

}
