package terminal.exceptions;

/**
 * Created by 12 on 27.05.2018.
 */
public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}