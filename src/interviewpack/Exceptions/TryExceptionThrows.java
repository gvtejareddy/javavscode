package interviewpack.Exceptions;

public class TryExceptionThrows {

    static int a;

    public static void main(String[] args) throws CustomMyException {

        if (!(a == 0)) {
            throw new CustomMyException("Wrong data");
        }

    }
}
