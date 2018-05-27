package terminal.exceptions;

/**
 * Created by 12 on 27.05.2018.
 */
public class TerminalServerException extends RuntimeException {
    public TerminalServerException(String message, Throwable cause) {
        super(message, cause);
    }
}