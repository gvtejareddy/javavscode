package hackerrank;

public class IncorrectFileExtensionException extends Exception{
  
    /**
     *
     */
    private static final long serialVersionUID = -3193076827762001512L;

    public IncorrectFileExtensionException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
    

}
