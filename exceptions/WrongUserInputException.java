package terminal.exceptions;

/**
 * Created by 12 on 27.05.2018.
 */
public class WrongUserInputException extends RuntimeException {
    public WrongUserInputException(String message) {
        super(message);
    }
}