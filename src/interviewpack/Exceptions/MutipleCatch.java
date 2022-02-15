package interviewpack.Exceptions;

public class MutipleCatch {
    static int a = 2;

    public static void main(String[] args) throws Exception {

        try {
            if (!(a == 3)) {
                throw new CustomMyException("message");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't divide by Zero!");
        } catch (CustomMyException e) {
            // catch the exception
            System.out.println("No matching element found.");
        } catch (Throwable e) {
            throw e; // rethrow the exception/error that occurred
        }

    }

}