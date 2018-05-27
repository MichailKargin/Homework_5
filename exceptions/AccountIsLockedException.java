package terminal.exceptions;

/**
 * Created by 12 on 27.05.2018.
 */
public class AccountIsLockedException extends RuntimeException {

    public AccountIsLockedException (String message) {
        super (message);
    }

    public AccountIsLockedException (String message, Throwable cause) {
        super (message, cause);
    }

}
