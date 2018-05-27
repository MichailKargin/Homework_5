package terminal.exceptions;

/**
 * Created by 12 on 27.05.2018.
 */
public class WrongPinException extends RuntimeException {
    public WrongPinException(String message) {
        super(message);
    }
}