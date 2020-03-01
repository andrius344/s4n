package co.com.s4n.model.exceptions;

public class ResultNotWaitedException extends AssertionError {


    public static final String COULD_NOT_CREATE = "The account could not be created";
    


    public ResultNotWaitedException(String message) {
        super(message);
    }

    public ResultNotWaitedException(String message, Throwable cause) {
        super(message, cause);
    }

}
