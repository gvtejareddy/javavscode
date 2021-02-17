package interviewpack.Exceptions;

public class TryExceptionThrow{

    /**
     *
     */
    private static final long serialVersionUID = -5366925483497612251L;
    public static int code = 3;

    public static void main(String[] args) {

        if (!(code == 2)) {
            throw new RuntimeException("value more than 2");
        }

    }

}
